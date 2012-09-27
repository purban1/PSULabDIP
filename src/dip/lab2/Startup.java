package dip.lab2;

// An useful import if you need it.
import java.text.NumberFormat;
// Another useful import if you need it.
import javax.swing.JOptionPane;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author your name goes here
 */
public class Startup {
    public static enum ServiceQuality {
           GOOD, FAIR, POOR
    };
 
    public static void main(String[] args) {
        
        BaggageServiceTipCalculatorStrategy service1 =
                new BaggageServiceTipCalculatorStrategy(
                BaggageServiceTipCalculatorStrategy.ServiceQuality.FAIR,5);
        
        FoodServiceTipCalculatorStrategy service2 = 
                new FoodServiceTipCalculatorStrategy(
                FoodServiceTipCalculatorStrategy.ServiceQuality.GOOD,220.50);
        
        TipService ts1 = new TipService(service1);
        TipService ts2 = new TipService(service2);
        
        System.out.println(ts1.getTotalTipForTheYear());
        System.out.println(ts2.getTotalTipForTheYear());
    }

}
