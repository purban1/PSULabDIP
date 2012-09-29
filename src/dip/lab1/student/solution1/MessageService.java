package dip.lab1.student.solution1;

import dip.lab3.*;

/**
 * BORROWED FROM LAB 3 AFTER I GOT LAB 3 WORKING TO ADD SOME OUTPUT PIZAZZ TO LAB 1.
 * This Service receives an input and an output object for how a message
 * is to be handled. 
 * @author Patrick Urban
 * 
 * Version  1.0
 */
public class MessageService {
    
    private IOutputMessageStrategy output;

    
    public MessageService(IOutputMessageStrategy output){
        this.output = output;
    }
    
     /**
     * @param output the output to display.
     */
    public final void setOutput(String output) {
        // validate the output before sending out
        this.output.setMessage(output);
    }

    
    
}
