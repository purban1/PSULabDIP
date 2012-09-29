package dip.lab1.student.solution1;

import dip.lab3.*;

/**
 * Output the message to the console
 *
 * @author Patrick Urban Version 1.0
 */
public class ConsoleOutputStrategy implements IOutputMessageStrategy {

    private final String OUTPUT_ERROR = "Output is not valid.";
    
    private String string;

    /**
     * Set the value of string
     *
     * @param string new value of string that will be output to the Council
     */
    public void setMessage(String message) {
        // validate the message and output OUTPUT_ERROR if validation fails
        System.out.println(message);
    }
}
