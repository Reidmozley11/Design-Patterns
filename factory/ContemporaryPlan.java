package factory;
/**
 * A virtual representation of a contemporary house's 
 * house plan
 * is a child of the class HousePlan. 
 * @author Reid Mozley 
 */
public class ContemporaryPlan extends HousePlan {
    
    /**
     * Initializes the number of rooms, 
     * number of windows, 
     * and the amount of square feet. 
     */
    public ContemporaryPlan(){
        super(5, 40, 3000);
    }

    /**
     * Uses the abstract method for setting materials and adds 
     * the needed materials to the contemporary house houseplan arraylist.
     */
    protected void setMaterials(){
        materials.add("Ceramics");
        materials.add("High-Strength Alloys");
        materials.add("Composites");
    }

    /**
     * Uses the abstract method for setting features and adds 
     * the needed features to the contemporary house houseplan arraylist.
     */
    protected void setFeatures(){
        features.add("Oversized Windows");
        features.add("Unconventional Roofs");
        features.add("Minimalism");
        features.add("Open Floor Plan");
    }

    /**
     * This returns the name of the house plan
     * and calls the super's toString to print out the 
     * required materials and features of this house plan. 
     */
    public String toString(){
        return "Contemporary Home" + "\n" + super.toString();  
    }
}
