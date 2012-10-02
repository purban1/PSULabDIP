package dip.lab3;

/**
 * This Service receives an input and an output object for how a message
 * is to be handled.
 * @author Patrick Urban
 * 
 * Version  1.0
 */
public class MessageService {
    
    private IInputMessageStrategy input;
    private IOutputMessageStrategy output;

    
    public MessageService(IInputMessageStrategy input, 
            IOutputMessageStrategy output){
        this.input = input;
        this.output = output;
    }

    /**
     * send the input object to the output
     */
    public final void produceTheMessage() {
        // validate the output before sending out
        this.output.setMessage(input);
    }

    
    
}
