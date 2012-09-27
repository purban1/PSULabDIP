
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
        String input;
        input = JOptionPane.showInputDialog(null, "What is your message?");
//        setInput(input);
        return input;
    }

//    /**
//     * @return the input to be returned
//     */
//    public final String getInput() {
//        return input;
//    }
//
//    /**
//     * @param input the input to store
//     */
//    private final void setInput(String input) {
//         validate the input from the Input Dialog box.
//        this.input = input;
//    }


}
