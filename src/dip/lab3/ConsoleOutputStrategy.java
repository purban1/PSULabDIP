package dip.lab3;

/**
 * Output the message to the console
 *
 * @author Patrick Urban Version 1.0
 */
public class ConsoleOutputStrategy implements IMessageOutputStrategy {

    private final String OUTPUT_ERROR = "Output is not valid.";
    
    /**
     * Set the value of string
     *
     * @param IMessageInputStrategy will get the Message Object to be output to 
     * the Council
     */
    public void setMessage(IMessageInputStrategy inputMessage) {
        Message msg = inputMessage.getMessage();
        
        // validate the message and output OUTPUT_ERROR if validation fails
        System.out.println(msg.getTheMessage());
    }
}
