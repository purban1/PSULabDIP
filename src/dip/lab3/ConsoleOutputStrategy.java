package dip.lab3;

/**
 * Output the message to the console
 *
 * @author Patrick Urban Version 1.0
 */
public class ConsoleOutputStrategy implements IOutputMessageStrategy {

    private final String OUTPUT_ERROR = "Output is not valid.";
    
    /**
     * Set the value of string
     *
     * @param IInputMessageStrategy will get the message to be output to 
     * the Council
     */
    public void setMessage(IInputMessageStrategy message) {
        // validate the message and output OUTPUT_ERROR if validation fails
        System.out.println(message.getMessage());
    }
}
