
package dip.lab3;

import java.util.Scanner;

/**
 *
 * @author Patrick Urban
 * Version 1.0
 */
public class ConsoleInputStrategy implements IInputMessageStrategy {

    private String input;
    
    Scanner keyboard = new Scanner(System.in);
    
    public String getMessage() {
        String input;
        System.out.println("What is your message?");
        input = keyboard.nextLine();
//        setInput(input);
        return input;
    }

//    /**
//     * @return the input
//     */
//    public final String getInput() {
//        return input;
//    }
//
//    /**
//     * @param input the input to set
//     */
//    private final void setInput(String input) {
//        // validate the input from the Console
//        this.input = input;
//    }


}
