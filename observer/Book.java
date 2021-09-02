package observer;
/**
 * A virtual representation of a book
 * @author Reid Mozley
 */


public class Book {
    private String title; 
    private String authorFirstName; 
    private String authorLastName; 

    /**
     * Initializes the Book class setting the proper title, first name, and last name. 
     * @param title This is the title of the current book being added to the class.
     * @param authorFirstName The authors first name being added to the class. 
     * @param authorLastName The authors last name being added to the class. 
     */
    public Book(String title, String authorFirstName, String authorLastName){
        this.title = title; 
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName; 
    }

    /**
     * Acquires the book's title
     * @return Returns the book's title 
     */
    public String getTitle(){
        return this.title; 
    }

    /**
     * Acquires the author's first name.
     * @return Returns the author's first name. 
     */
    public String getAuthorFirstName(){
        return this.authorFirstName; 
    }

    /**
     * Acquires the author's last name
     * @return Returns the author's last name
     */
    public String getAuthorLastName(){
        return this.authorLastName; 
    }

    /**
     * Uses the getter methods to create an output toString() to be used by the observer classes display() methods. 
     */
    public String toString(){
        return "-" + getTitle() + " " + getAuthorFirstName() + " " + getAuthorLastName();  
    }
}
