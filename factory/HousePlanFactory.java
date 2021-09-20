package factory;
/**
 * A virtual representation of a house plan creation 
 * factory. This factory requests the creation of the houseplans
 * @author Reid Mozley
 */
public class HousePlanFactory {

    /**
     * A method that creates a house plan by 
     * first checking and making sure that
     * it exists as a currently avalible house plan. 
     * @param type this is the type of house plan that will be tested 
     * @return returns the house type that the user inputted so long as it is a real
     * house plan, otherwise it will return null. 
     */
    public static HousePlan createHousePlan(String type) {
        String house = type.toLowerCase(); 
        if (house == "log cabin"){
            return new LogCabinPlan(); 
        } else if (type.equalsIgnoreCase("tiny home")){
            return new TinyHomePlan(); 
        } else if (house == "contemporary home"){
            return new ContemporaryPlan(); 
        } else {
            return null; 
        }
    }
}
