
package dip.lab3;

import java.util.Random;

/**
 * This class returns a random message
 * @author Patrick Urban
 * Version 1.0
 */
public class RandomMessageInputStrategy implements IInputMessageStrategy {

    private String[] message = {"Advanced Java is extremely interesting.",
        "OOP can be challenging and rewarding.",
        "Learning design principals is essential to good prgramming.",
        "Abstractions should never depend on details, instead details should"
            + " depend on abstractions.",
        "I am just filler and not really an important message."};
    
    
    public final String getMessage() {
        Random r = new Random(System.nanoTime());
        int randomResult = r.nextInt(message.length);
        return message[randomResult];
    }

}
