package dip.lab1.student.solution1;

import dip.lab1.*;

/**
 * An implementation IEmployee interface. A low-level classes
 * in the DIP. This will be a strategic object for Salaried employees.
 * 
 *
 * @author Patrick Urban
 */
public class SalariedEmployee implements IEmployee {

    private double annualSalary;
    private double annualBonus;

    /** default constructor -- Removed to force initialization of the object
     */
//    public SalariedEmployee() {}

    /**
     * Mandatory constructor. 
     * @param annualSalary - the employee's annual salary
     * @param annualBonus - a bonus benefit, if any
     */
    public SalariedEmployee(double annualSalary, double annualBonus) {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }

    /**
     * Returns annual bonus for salaried workers.
     * @return annual bonus or zero if none.
     */
    public double getAnnualBonus() {
        return annualBonus;
    }

    /**
     * 
     * @param annualBonus -- sets the bonus for the salaried employees
     */
    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }

    /**
     * 
     * @param annualSalary -- here in case there was an error in entering the 
     * yearly salary of the employee. Constructor initially used to set the hourly rate.
     */
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    
    /**
     * 
     * @return -- returns the annual salary 
     */
    public double getAnnualSalary() {
        return annualSalary;
    }
    
    /**
     * 
     * @param annualPay -- returns the annual salary + any Bonuses
     */
    public double getAnnualPay() {
        return this.getAnnualSalary() + this.getAnnualBonus();
    }
}
