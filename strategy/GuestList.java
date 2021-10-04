package strategy;

import java.util.ArrayList;

public class GuestList {

    private SearchBehavior searchBehavior;

    BinarySearch bSearch = new BinarySearch();
    LinearSearch lSearch = new LinearSearch();

    private ArrayList<String> people;
    private String title = " ";

    /**
     * Adds a title to the guest list
     * 
     * @param title name that you want the guest list title to be
     */
    public GuestList(String title) {
        this.title = title;
        this.people = new ArrayList<>();
        this.searchBehavior = new LinearSearch();
    }

    /**
     * Compares and adds a new person to the guest list ensuring duplications do not
     * happen
     * 
     * @param person name of the person being added to the guest list
     * @return
     */
    public boolean add(String person) {
        if (searchBehavior.contains(people, person))
            return false;

        people.add(person);
        return true;
    }

    /**
     * Compares and removes a person from the guest list, checks if they're on the
     * list before removing.
     * 
     * @param person name of the person being removed
     * @return returns a true or false which activates the correct orientation for
     *         the add method in ListDriver
     */
    public boolean remove(String person) {
        if (searchBehavior == bSearch) {
            if (bSearch.contains(people, person)) {
                people.remove(person);
                return true;
            } else {
                return false;
            }
        } else {
            if (lSearch.contains(people, person)) {
                people.remove(person);
                return true;
            } else {
                return false;
            }
        }
    }

    /**
     * Retrieves the title of the Guest List for use in ListDriver
     * 
     * @return returns the title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Sets the search behavior of the program switching from linear search and
     * binary search
     * 
     * @param searchBehavior defaults on linear
     */
    public void setSearchBehavior(SearchBehavior searchBehavior) {
        this.searchBehavior = searchBehavior;
    }

    /**
     * Retrieves the arraylist containing the guest list
     * 
     * @return returns the current guest list
     */
    public ArrayList<String> getList() {
        return people;
    }
}