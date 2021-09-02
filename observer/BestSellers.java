package observer;
/**
 * A virtual program to update and store books that are labeled as best sellers. 
 * @author Reid Mozley
 */

import java.util.*;

public class BestSellers implements Subject {

    /**
     * An array list to store all observers that want to get updated
     * An array list to contain the bestselling books
     */
    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;

    /**
     * Creates the instances of the observers and bestsellers arraylists
     */
    public BestSellers() {
        observers = new ArrayList<>();
        bestSellers = new ArrayList<>();

    }

    /**
     * Adds observers to the arraylist so that they can be 
     * properly notified when an update is pushed
     * @param observer This observer will be added to the current arraylist subscription 
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes observers from the update notification subscriptions 
     * @param observer This observer will be removed from the current update notifcations 
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifies the current observers within the arraylist 
     * making sure that they recieve an update
     * @param book This is the current book that will be pushed to the observers as an update to their lists
     */
    public void notifyObservers(Book book) {
        for (Observer observer : observers) {
            observer.update(book);
        }

    }

    /**
     * Adds a book to the bestSellers arraylist and calls the method notifyObservers. 
     * This makes sure that a book is added and pushes out an update. 
     * @param book The book that will be added to the arraylist and the book that will be sent out in the update. 
     */
    public void addBook(Book book) {
        bestSellers.add(book);
        notifyObservers(book);
    }
}
