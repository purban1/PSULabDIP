
package dip.lab3;

import java.util.Random;

/**
 * This class returns a random message
 * @author Patrick Urban
 * Version 1.0
 */
public class RandomMessageInputStrategy implements IMessageInputStrategy {

    // An array of Message objects in Message Array
    private Message[] randomMessage = {
        new Message("Advanced Java is extremely interesting."),
        new Message("OAD can be challenging and rewarding."),
        new Message("Learning design principals is essential to good prgramming."),
        new Message("Abstractions should never depend on details, instead "
            + "details should depend on abstractions."),
        new Message("I am just filler and not really an important message.")
    };
    
    /** 
     * Generate a Random Int to pick a message to return as Message Object for 
     * the output. 
     */
    public final Message getMessage() {
        Random rand = new Random(System.nanoTime());
        int randomIndexNumber = rand.nextInt(randomMessage.length);
        return randomMessage[randomIndexNumber];
    }

}
