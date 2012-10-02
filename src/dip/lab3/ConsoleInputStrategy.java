
package dip.lab3;

import java.util.Scanner;

/**
 * This class get input from the console.
 * @author Patrick Urban
 * Version 1.0
 */
public class ConsoleInputStrategy implements IInputMessageStrategy {

//    private String input;
    
    Scanner keyboard = new Scanner(System.in);
    
    public String getMessage() {
        System.out.println("What is your message?");

        return keyboard.nextLine();

    }

}
