
package dip.lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author Patrick Urban
 * Version 1.0
 */
public class GuiInputStrategy implements IInputMessageStrategy {
    
    private String input;
    
    public String getMessage() {
        this.input = JOptionPane.showInputDialog(null, "What is your message?");
//        setInput(input);
        return input;
    }
}

