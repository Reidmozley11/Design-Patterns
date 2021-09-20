package factory;
/**
 * An abstract virtual houseplan creation program 
 * requires setMaterials and setFeatures methods of the 
 * children
 * @author Reid Mozley
 */
import java.util.ArrayList;

public abstract class HousePlan {

    protected ArrayList<String> materials = new ArrayList<String>();
    protected ArrayList<String> features = new ArrayList<String>();

    private int numRooms = 0;
    private int numWindows = 0;
    private int squareFeet = 0;

    /**
     * Sets the values for the number of rooms
     * number of windows and the number of square feet
     * @param numRooms the number of rooms that are inside of the house plan
     * @param numWindows the number of windows that are inside the house plan
     * @param squareFeet the amount of square feet for the house plan
     */
    public HousePlan(int numRooms, int numWindows, int squareFeet) {
        this.numRooms = numRooms; 
        this.numWindows = numWindows; 
        this.squareFeet = squareFeet;
    }

    /**
     * Is called and runs the childrens material formation method
     */
    protected abstract void setMaterials();

    /**
     * Is called and runs the childrens feature formation method
     */
    protected abstract void setFeatures(); 

    /**
     * A getter for the material list
     * @return returns the material array list
     */
    public ArrayList<String> getMaterials() {
         return materials; 
    }

    /**
     * A getter for the feature list
     * @return returns the feature array list
     */
    public ArrayList<String> getFeatures() {
         return features;
    }

    /**
     * A getter for the number of rooms inside of the house plan 
     * @return returns the number of rooms inside the house plan
     */
    public int getNumRooms() {
        return this.numRooms;
    }

    /**
     * A getter for the number of windows inside of the house plan
     * @return returns the house plans number of windows
     */
    public int getNumWindows() {
        return this.numWindows;
    }

    /**
     * A getter for the amount of square feet inside of the house plan 
     * @return returns the amount of square feet
     */
    public int getSquareFeet() {
        return this.squareFeet;
    }

    /**
     * A method designed to print out the 
     * square feet, amount of rooms, windows, materials, and features
     * of a house plan. 
     */
    public String toString() {
        setMaterials();
        setFeatures();
        String result = ""; 
        result += "Square Feet: " + this.squareFeet + "\n"; 
        result += "Room: " + this.numRooms + "\n";
        result += "Windows: " + this.numWindows + "\n\n"; 

        result += "Materials: \n";
        for(String material : materials){
            result += "- " + material + "\n"; 
        }
        result += "\nFeatures: \n";
        for (String feature : features){
            result += "- " + feature + "\n"; 
        }

        return result; 
    }
}
