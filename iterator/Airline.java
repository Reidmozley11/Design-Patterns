package iterator;

import java.util.Iterator;

/**
 * A virtual airline program that creates all the flights
 * @author Reid Mozley
 */
public class Airline {
    private String title; 
    private Flight[] flights; 
    private int size; 

    /**
     * Sets the intial values for the arraylist and the size iterator
     * @param title the title of the airline
     */
    public Airline(String title) {
        this.title = title; 
        size = 0; 
        flights = new Flight[2]; 
    }

    /**
     * Checks if the current size of the array is equal to the length of the array
     * if it is it calls growArray and sets the flights array equal to it.
     * Then it populates the next value in flights array. 
     * @param flightNum the number of the flight
     * @param from where the current flight is from
     * @param to where the current flight is going to
     * @param duration the duration of the current flight
     * @param transfers the amount of transfers the current flight will need
     */
    public void addFlight(String flightNum, String from, String to, int duration, int transfers) {
        if (size == flights.length) flights = growArray(flights);
        flights[size] = new Flight(flightNum, from, to, duration, transfers); 
        size++; 
    }

    /**
     * Gets the title of the airline
     * @return this.title the title of the airline
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Grows the array by doubling it and then filling a new array
     * this new array then gets populated by what the original
     * array had within. 
     * @param flights the current flights in the array
     * @return biggerFlight the copy of the original array with the larger size
     */
    private Flight[] growArray(Flight[] flights) {
        Flight[] biggerFlight = new Flight[flights.length * 2]; 
        for (int i = 0; i < flights.length; i++) {
            biggerFlight[i] = flights[i]; 
        }
        return biggerFlight; 
    }

    /**
     * Creates a constructor for return a new FlightIterator
     * @return FlightIterator with the current flights array list
     */
    public Iterator<Flight> createIterator() {
        return new FlightIterator(flights);
    }
}
