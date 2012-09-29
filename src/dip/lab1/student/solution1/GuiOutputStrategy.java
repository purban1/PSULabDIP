
package dip.lab1.student.solution1;

import dip.lab3.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Patrick Urban
 * Version  1.0
 */
public class GuiOutputStrategy implements IOutputMessageStrategy {

    private final String OUTPUT_ERROR = "Output is not valid.";
    
    public void setMessage(String message) {
        // validate the message and output OUTPUT_ERROR if validation fails
        JOptionPane.showMessageDialog(null, message);
    }


}
