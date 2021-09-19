import java.util.ArrayList;

public abstract class HousePlan {

    protected ArrayList<String> materials;
    protected ArrayList<String> features;

    private int numRooms = 0;
    private int numWindows = 0;
    private int squareFeet = 0;

    public HousePlan(int numbRooms, int numbWindows, int squareFeet) {

    }

    protected void setMaterials() {

    }

    protected void setFeatures() {

    }

    public ArrayList<String> getMaterials() {

    }

    public ArrayList<String> getFeatures() {

    }

    public int getNumRooms() {
        return this.numRooms;
    }

    public int getNumWindows() {
        return this.numWindows;
    }

    public int getSquareFeet() {
        return this.squareFeet;
    }

    public String toString() {
        return "temp";
    }
}
