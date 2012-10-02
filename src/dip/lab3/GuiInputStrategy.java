package dip.lab3;

import javax.swing.JOptionPane;

/**
 * This class gets a message from a input dialog box.
 *
 * @author Patrick Urban Version 1.0
 */
public class GuiInputStrategy implements IMessageInputStrategy {

    private String input;

    public Message getMessage() {
        input = JOptionPane.showInputDialog(null, "What is your message?");

        Message message = new Message(input);
        return message;

    }
}
