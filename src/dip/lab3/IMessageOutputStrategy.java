package dip.lab3;

/**
 * Interface for output message strategies
 * @author Patrick Urban
 */
public interface IMessageOutputStrategy {
    public abstract void setMessage(IMessageInputStrategy message);
}
