package factory;
/**
 * A virtual house plan for a log cabin. 
 * Is the child of the class HousePlan
 * @author Reid Mozley
 */
public class LogCabinPlan extends HousePlan {

    /**
     * The initialization of the amount of rooms
     * number of windows 
     * and square feet avalible. This is all called through 
     * the Houseplan class using super. 
     */
    public LogCabinPlan(){
        super(2, 10, 1800);
    }

    /**
     * Uses the abstract method for setting materials and adds 
     * the needed materials to the log cabin houseplan arraylist.
     */
    protected void setMaterials(){
        materials.add("Log Siding");
        materials.add("Board and Batten Siding");
        materials.add("White Pine");
    }

    /**
     * Uses the abstract method for setting features and adds 
     * the needed features to the log cabin houseplan arraylist.
     */
    protected void setFeatures(){
        features.add("Timbered Roof");
        features.add("High Insulation");
        features.add("Rustic Effect");
    }

    /**
     * This returns the name of the houseplan and calls the super's
     * toString to print out the requirements for the log cabin. 
     */
    public String toString(){
        return "Log Cabin" + "\n" + super.toString(); 
    }
}
