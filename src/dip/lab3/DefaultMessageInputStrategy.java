
package dip.lab3;

/**
 * This class just return a magic number message
 * @author Patrick Urban
 * Version 1.0
 */
public class DefaultMessageInputStrategy implements IInputMessageStrategy {

    private String message = "Advanced Java is extremely interesting.";
    
    
    public final String getMessage() {
        return message;
    }

}
