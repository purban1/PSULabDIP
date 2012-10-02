
package dip.lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author Patrick Urban
 * Version  1.0
 */
public class GuiOutputStrategy implements IOutputMessageStrategy {

    private final String OUTPUT_ERROR = "Output is not valid.";
    
    /**
     * Set the value of string
     *
     * @param IInputMessageStrategy will get the message to be output to 
     * the dialog box
     */
    public void setMessage(IInputMessageStrategy message) {
        // validate the message and output OUTPUT_ERROR if validation fails
        JOptionPane.showMessageDialog(null, message.getMessage());
    }


}
