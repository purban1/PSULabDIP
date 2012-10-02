package dip.lab1.student.solution1;

import dip.lab1.*;
import java.text.NumberFormat;

/**
 * Just a start and test class for this program. Objects created in this class
 * require that the hourly wage and annual hours be provided to the constructor
 * of the strategic object HourlyEmployee and that annualSalary plus any bonus
 * pay for the year be passed to the strategic objects that are salaried
 * employees.
 *
 * @author jlombardo & Patrick Urban (modified code)
 * Version 1.0
 */
public class Startup {

    public static void main(String[] args) {

        String results;

        //Low-level modules
        HourlyEmployee emp1 = new HourlyEmployee(10.50, 2020);
        SalariedEmployee emp2 = new SalariedEmployee(45000, 1250);
        SalariedEmployee emp3 = new SalariedEmployee(90000, 0);

        // Low-level modules borrowed from lab 3 (after I fot it working to 
        // provide options for how the results can be output.
        IOutputMessageStrategy io1 = new ConsoleOutputStrategy();
        IOutputMessageStrategy io2 = new GuiOutputStrategy();

        // High-level module
        HRService hr = new HRService();

        /** High-level module for output (borrowed from lab 3 after 
         * I got it working). I'm Testing both output types at once.
        */ 
        MessageService ms1 = new MessageService(io1);
        MessageService ms2 = new MessageService(io2);

        // Just utility code to format numbers nice.
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        // Test input/output..
//        System.out.println("Employee 1 annual compensation: " +
//            nf.format(hr.getAnnualPay(emp3)));
//        System.out.println("Employee 2 annual compensation: " +
//            nf.format(hr.getAnnualPay(emp2)));
//        System.out.println("Employee 3 annual compensation: " +
//            nf.format(hr.getAnnualPay(emp1)));
        results = "The salary totals for all 3 employees are as follows:\n" 
                + "Employee 1 annual compensation: " + nf.format(hr.getAnnualPay(emp3)) + "\n"
                + "Employee 2 annual compensation: " + nf.format(hr.getAnnualPay(emp2)) + "\n"
                + "Employee 3 annual compensation: " + nf.format(hr.getAnnualPay(emp1));

        // Send results to the console
        ms1.setOutput(results);
        
        // Send result to the screen
        ms2.setOutput(results);

    }
}
