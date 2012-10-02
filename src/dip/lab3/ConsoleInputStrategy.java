package dip.lab3;

import java.util.Scanner;

/**
 * This class get input from the console.
 *
 * @author Patrick Urban Version 1.0
 */
public class ConsoleInputStrategy implements IMessageInputStrategy {

    private String input;
    Scanner keyboard = new Scanner(System.in);

    public Message getMessage() {
        System.out.println("What is your message?");
        input = keyboard.nextLine();
        Message message = new Message(input);
        return message;
    }
}
