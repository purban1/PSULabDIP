package dip.lab3;

/**
 *
 * @author Patrick Urban Version 1.0
 */
public class Startup {

    public static void main(String[] args) {

        /**
         * input will be used to store the input text and send to output
         */
        String input;

        /**
         * First create the Strategy Objects that the Service will use. 
         * StrategyType variable = specific strategy
         * Next, create the Service and tell the service what kind of input and 
         * output strategies the messageService object will be receiving. This 
         * way the  service knows the specific input and output types the  
         * service is suppose to access.
         */
        
        // Pick an input Strategy
//        IMessageInputStrategy inputMessage = new GuiInputStrategy();
//        IMessageInputStrategy inputMessage = new DefaultMessageInputStrategy();
        IMessageInputStrategy inputMessage = new RandomMessageInputStrategy();

        // Pick an Output Strategy
        IMessageOutputStrategy outputMessage = new GuiOutputStrategy();
//        IMessageOutputStrategy outputMessage = new ConsoleOutputStrategy();

        
        MessageService service = 
                new MessageService(inputMessage, outputMessage);

        /**
         * Gets input and sends directly to an output object
         */
        service.produceTheMessage();
        

    }
}
