package dip.lab3;

/**
 *
 * @author Patrick Urban Version 1.0
 */
public class Startup {

    public static void main(String[] args) {

        String input;

        /**
         * First create the Strategy Objects that the Service will use. 
         * StrategyType variable = specific strategy
         * Next, create the Service and tell the service what kind of input and output
         * strategies the messageService object will be receiving. This way the
         * the service knows the specific input and output types the service is 
         * suppose to access.
         */

        IInputMessageStrategy inputMessage = new ConsoleInputStrategy();
        IOutputMessageStrategy outputMessage = new GuiOutputStrategy();

        
        MessageService service = new MessageService(inputMessage, outputMessage);

        input = service.getInput();
        service.setOutput(input);

    }
}
