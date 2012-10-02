 package dip.lab1.student.solution1;

import dip.lab1.*;
import javax.swing.JOptionPane;

/**
 * A high-level class that delegates to employee objects to do the work. Does
 * ENUM removed as the Service class will make the calls to the strategic 
 * objects
 *
 * @author Patrick Urban
 */
public class HRService {
//    /** 
//     * Constants can be used for retrieving annual wages of
//     * various employee types. 
//     */
//    public static final String SALARIED_TYPE = "Salaried";
//    public static final String HOURLY_TYPE = "Hourly";

    private IEmployee employee;
    
    /**
     * 
     * @param e is an employee object
     * @return will return the annual salary for the employee
     */
    public Double getAnnualPay(IEmployee e){
        // validate that 'e' is of type IEmployee
        return e.getAnnualPay();
    }

  
}
