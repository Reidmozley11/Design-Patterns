package factory;
/**
 * A virtual representation of a Tiny House's houseplan.
 * Is a child of the class HousePlan
 * @author Reid Mozley
 */
public class TinyHomePlan extends HousePlan {

    /**
     * Initialization of the number of rooms
     * number of windows, 
     * and the square feet needed for creating a tiny house
     */
    public TinyHomePlan(){
        super(1, 5, 200);
    }

    /**
     * Uses the abstract method for setting materials and adds 
     * the needed materials to the tiny house houseplan arraylist.
     */
    protected void setMaterials(){
        materials.add("Lumber");
        materials.add("Insulation");
        materials.add("Hardware");
    }

    /**
     * Uses the abstract method for setting features and adds 
     * the needed features to the tiny house houseplan arraylist.
     */
    protected void setFeatures(){
        features.add("Natural Light");
        features.add("Creative Storage");
        features.add("Multipurpose areas");
        features.add("Multi-use Applications");
    }

    /**
     * This returns the name of the houseplan and
     * calls the super toString to print out the 
     * requirements for the tiny house houseplan. 
     */
    public String toString(){
        return "Tiny House" + "\n" + super.toString(); 
    }
}
