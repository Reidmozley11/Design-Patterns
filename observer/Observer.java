package observer;
/**
 * An interface program for the observers.
 * Requirements: update method, display method.  
 * @author Reid Mozley
 */


public interface Observer {
    public void update(Book book);
    public void display(); 
}
