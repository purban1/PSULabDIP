
package dip.lab3;

import javax.swing.JOptionPane;

/**
 * This class gets a message from a input dialog box.
 * @author Patrick Urban
 * Version 1.0
 */
public class GuiInputStrategy implements IInputMessageStrategy {
    
//    private String input;
    
    public String getMessage() {

        return JOptionPane.showInputDialog(null, "What is your message?");

    }
}

