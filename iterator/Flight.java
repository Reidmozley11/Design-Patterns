package iterator;

/**
 * A virtual representation of a flight 
 * @author Reid Mozley 
 */

public class Flight {
    private String flightNum; 
    private String from; 
    private String to; 
    private int duration; 
    private int transfers; 

    /**
     * Sets up the virtual flight 
     * @param flightNum the number of the current flight
     * @param from where the current flight is from
     * @param to where the current flight is heading to
     * @param duration the duration of the current flight
     * @param transfers the transfers the current flight will need
     */
    public Flight(String flightNum, String from, String to, int duration, int transfers) {
        this.flightNum = flightNum; 
        this.from = from; 
        this.to = to; 
        this.duration = duration; 
        this.transfers = transfers; 
    }

    /**
     * Retrieves the from time of the flight
     * @return this.from sends where the from is
     */
    public String getFrom() {
        return this.from; 
    }

    /**
     * Retrives where the flight goes to
     * @return this.to where the flight is to 
     */
    public String getTo() {
        return this.to; 
    }

    /**
     * Gets the duration
     * @return this.duration sends the duration of the flight
     */
    public int getDuration() {
        return this.duration; 
    }

    /**
     * Gets the transfer
     * @return this.transfers sends the transfers the flight takes
     */
    public int getNumTransfers() {
        return this.transfers; 
    }

    /**
     * Simple toString() that prints out the flights stats 
     */
    public String toString() {
        String transferring = ""; 
        if (transfers == 1) {
            transferring = "1 Transfer";
        } else if (transfers > 1) {
            transferring = transfers + " Transfers";
        } else {
            transferring = "Direct Flight"; 
        }
        int hours = duration / 60; 
        int minutes = duration % 60; 

        return "FlightNumber: " + flightNum + "\n" + 
                "From: " + from + "\n" + 
                "To: " + to + "\n" + 
                "Duration: " + hours + " hours " + minutes + " minutes" + "\n" +
                transferring; 
    }
}
