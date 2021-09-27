package iterator;

import java.util.Iterator;

/**
 * A iteration program for filling an array 
 * @author Reid Mozley
 */
public class FlightIterator implements Iterator<Flight> {
    private Flight[] flights; 
    private int position; 

    /**
     * Iterates through the array and populates it with the 
     * correct values so that flights is correct
     * @param flights the flight that is currently being added to the array
     */
    public FlightIterator (Flight[] flights) {
        position = 0; 
        this.flights = new Flight[flights.length]; 
        for (int i = 0; i < flights.length; i++) {
            this.flights[i] = flights[i];
        }
    }

    /**
     * Checks if there is another value inside of the flights array
     * if there is it returns true
     * @return boolean for if the array has another remaining value
     */
    public boolean hasNext() {
        return ((position < flights.length) && (flights[position] != null)); 
    }

    /**
     * Moves into teh next flight inside of the array
     * @return takeOff is the next item within the array
     */
    public Flight next() {
        Flight takeOff = flights[position]; 
        position++; 
        return takeOff; 
    }
}
