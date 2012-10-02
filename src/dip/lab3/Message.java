/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author production
 */
public class Message {
    private String theMessage;
    
    public Message(String message){
        this.theMessage = message;
    }

    public final String getTheMessage() {
        return theMessage;
    }

    public final void setTheMessage(String theMessage) {
        this.theMessage = theMessage;
    }

}
