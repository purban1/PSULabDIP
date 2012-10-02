
package dip.lab3;

/**
 * This class just return a magic number message
 * @author Patrick Urban
 * Version 1.0
 */
public class DefaultMessageInputStrategy implements IMessageInputStrategy {

    private final String MSG = "Advanced Java is extremely interesting.";
    
    
    public final Message getMessage() {
        Message message = new Message(MSG);
        return message;
    }

}
