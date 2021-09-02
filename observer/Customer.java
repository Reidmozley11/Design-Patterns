package observer;

import java.util.*;

public class Customer implements Observer {
    private Subject subject;
    private String firstName;
    private String lastName;
    private ArrayList<Book> wishList;

    public Customer(Subject subject, String firstName, String lastName) {
        this.subject = subject;
        this.firstName = firstName;
        this.lastName = lastName;
        this.wishList = new ArrayList<>();
        subject.registerObserver(this);
    }

    public void update(Book book) {
        wishList.add(book);
    }

    public void display() {
        System.out.println("Wish List:");
        for(int i = 0; i<wishList.size(); i++){
            System.out.println(wishList.get(i));
        }
    }
    
}
