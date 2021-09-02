package observer;
/**
 * A virtual representaion of a customers best selling book wishlist
 * @author Reid Mozley
 */

import java.util.*;

public class Customer implements Observer {
    private Subject subject;
    private String firstName;
    private String lastName;
    /**
     * An arraylist of the books that the customer wishes to purchase
     */
    private ArrayList<Book> wishList;

    /**
     * Initializes the Customers first and last name while also 
     * subscribing them to notifications from the subject 
     * best sellers. This is where their new array list > wish list 
     * will be based off. 
     * @param subject The current subject being monitored by the current observer
     * @param firstName The customers first name
     * @param lastName The customers last name
     */
    public Customer(Subject subject, String firstName, String lastName) {
        this.subject = subject;
        this.firstName = firstName;
        this.lastName = lastName;
        this.wishList = new ArrayList<>();
        subject.registerObserver(this);
    }

    /**
     * The update method called by the subject
     * adds a best seller to the wishlist everytime there 
     * is an update. 
     */
    public void update(Book book) {
        wishList.add(book);
    }

    /**
     * A display method for showing a visual representation
     * of the customers current wish list
     */
    public void display() {
        System.out.println("Wish List:");
        for(int i = 0; i<wishList.size(); i++){
            System.out.println(wishList.get(i));
        }
    }
    
}
