package observer;
/**
 * An interface program for the subject
 * Requirements: registration method, removal method, and notification methods.  
 * @author Reid Mozley
 */

public interface Subject {
    public void registerObserver(Observer observer); 
    public void removeObserver(Observer observer); 
    public void notifyObservers(Book book); 
}
