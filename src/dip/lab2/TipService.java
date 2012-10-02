package dip.lab2;

/**
 *
 * @author purban1
 */
public class TipService {
    private ITipCalculationStrategy tipCalculationStrategy;

   public TipService(ITipCalculationStrategy ts) {
        this.tipCalculationStrategy = ts;
    }
    
   /**
    * The method requires an already existing tipCalculation object
    * @return will return the tip
    */ 
   public double getTotalTipForTheYear() {
        return tipCalculationStrategy.getTip();
    }
    
    /**
     * This convenience method receives a tipCalculation object that
     * will be used to then return the tip to retrieve the tip
     * @param ts is a TipCalculationStrategy object
     * @return will return the tip
     */
    
    public double getTotalTipForTheYear(ITipCalculationStrategy ts) {
        return ts.getTip();
    }

    /**
     * @param tipCalculationStrategy the tipCalculationStrategy to set
     */
    public void setTipCalculationStrategy(ITipCalculationStrategy tipCalculationStrategy) {
        this.tipCalculationStrategy = tipCalculationStrategy;
    }

    
    
}
