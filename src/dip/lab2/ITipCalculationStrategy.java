/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2;

/**
 *
 * @author purban1
 */
public interface ITipCalculationStrategy {
    public static enum ServiceQuality {
        GOOD, FAIR, POOR
    }
    
    public abstract double getTip();
}
