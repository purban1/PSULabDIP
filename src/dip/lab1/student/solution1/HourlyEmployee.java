package dip.lab1.student.solution1;

import dip.lab1.*;

/**
 * An implementation IEmployee interface. A low-level classes
 * in the DIP. This will be a strategic object for Hourly employees
 *
 * @author Patrick Urban
 */
public class HourlyEmployee implements IEmployee {
    
    private double hourlyRate;
    private double totalHrsForYear;
//    /** default constructor.  -- Removed to force initialization of the object 
//        */
//    public HourlyEmployee() {}

    /**
     * Mandatory constructor. 
     * @param hourlyRate - the rate per hour that the employee is paid
     * @param totalHrsForYear - total hours worked or predicted per year
     */
    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
    }

    public double getAnnualPay() {
        return hourlyRate * totalHrsForYear;
    }
    
    /**
     * @return the hourly rate of an employee
     */
    public double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * 
     * @param hourlyRate -- here is can an error in entering the hourly rate
     * of the employee. Constructor initially used to set the hourly rate.
     */
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    /**
     * Is this polymorphic? Should it be? Does it belong here?
     * @return
     */
    public double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    /**
     * Is this polymorphic? Should it be? Does it belong here?
     * @param totalHrsForYear -- think carefully about this
     */
    public void setTotalHrsForYear(double totalHrsForYear) {
        this.totalHrsForYear = totalHrsForYear;
    }
}
