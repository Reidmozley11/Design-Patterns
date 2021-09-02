package observer;

import java.util.LinkedList;
import java.util.Queue;

public class Store implements Observer {
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers = new LinkedList<>();

    public Store(Subject subject) {
        this.subject = subject;
        this.title = title;
        subject.registerObserver(this);
    }

    public void update(Book book) {
        if (bestSellers.size() == 5) {
            bestSellers.remove();
            bestSellers.add(book);
        } else {
            bestSellers.add(book);
        }
    }

    public void display() {
        System.out.println("Top 5 Best Sellers:");
        for(Book book : bestSellers){
            System.out.println(book.toString());
        }
        System.out.println("\n");
    }
}
