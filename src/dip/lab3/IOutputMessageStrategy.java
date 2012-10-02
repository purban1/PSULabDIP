package dip.lab3;

/**
 * Interface for output message strategies
 * @author Patrick Urban
 */
public interface IOutputMessageStrategy {
    public abstract void setMessage(IInputMessageStrategy message);
}
