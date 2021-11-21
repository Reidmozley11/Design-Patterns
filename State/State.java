/**
 * An virtual representation of a difficulty meter. 
 * Implements getNum() getOperation()
 * levelUp() and levelDown() 
 */
public interface State {
    public int getNum(); 
    public String getOperation(); 
    public void levelUp(); 
    public void levelDown(); 
}
