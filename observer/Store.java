package observer;
/**
 * A program that observes best sellers and stores the top 5 current best selling books
 * within a queue. 
 * @author Reid Mozley
 */


import java.util.LinkedList;
import java.util.Queue;

public class Store implements Observer {
    private Subject subject;
    private String title;

    /**
     * A java implemented interface for queue's 
     * uses the built in linked list method
     */
    private Queue<Book> bestSellers = new LinkedList<>();

    /**
     * Initializes the subject and the title
     * Subscribes this class to the observer class BestSellers 
     * in order for Store to recieve updates
     * @param subject Brings in a Subject class in order to allow registration, in this case BestSellers
     */
    public Store(Subject subject) {
        this.subject = subject;
        this.title = title;
        subject.registerObserver(this);
    }

    /**
     * Updates the books when the observer is notified
     * Maintains that only 5 books are inside the Best Selling list
     * at a time
     * @param book The current book that came with the update
     */
    public void update(Book book) {
        if (bestSellers.size() == 5) {
            bestSellers.remove();
            bestSellers.add(book);
        } else {
            bestSellers.add(book);
        }
    }

    /**
     * Displays the Top 5 Best Selling books within the queue 
     * Reference: https://stackoverflow.com/questions/5413934/values-in-queue-java
     */
    public void display() {
        System.out.println("Top 5 Best Sellers:");
        for(Book book : bestSellers){
            System.out.println(book.toString());
        }
        System.out.println("\n");
    }
}
