
package dip.lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author Patrick Urban
 * Version  1.0
 */
public class GuiOutputStrategy implements IMessageOutputStrategy {

    private final String OUTPUT_ERROR = "Output is not valid.";
    
    /**
     * Set the value of string
     *
     * @param IMessageInputStrategy will get a Message Object to be output to 
     * the dialog box
     */
    public void setMessage(IMessageInputStrategy inputMessage) {
        // validate inputMessage and output OUTPUT_ERROR if validation fails
        Message msg = inputMessage.getMessage();
        
        JOptionPane.showMessageDialog(null, msg.getTheMessage());
    }


}
