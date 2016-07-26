// File:   rolldice/RollDice.java
// Description: Main program and applet display two dice and roll them.
// Tag: <applet code="rolldice.RollDice.class" archive="rolldice.jar" 
//            width="140" height="117"></applet>
// Author: Fred Swartz - 2006-11-30 - Placed in public domain.

package rolldice;

import javax.swing.*;

///////////////////////////////////////////////////////// class RollDice
public class RollDice extends JApplet {
    
    //=============================================== applet constructor
    /** Applet constructor requires putting the panel in applet.*/
    public RollDice() {
        this.setContentPane(new RollDicePanel());
    }
    
    //====================================================== method main
    /** Create JFrame and set content pane to a RollDicePanel. */
    public static void main(String[] args) {
    	//1. Create the frame.
    	JFrame window = new JFrame("Dice Demo");
    	
    	//2. Optional: What happens when the frame closes?
    	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	//3. Create components and put them in the frame.
    	window.setContentPane(new RollDicePanel());
    	
    	//4. Size the frame.
        window.pack();
        
        System.out.println(window.getContentPane().getSize());
        window.setLocationRelativeTo(null);
        
        //5. Show it.
        window.setVisible(true);
        
    }
}