package decorator;
/**
 * A virtual representaion of a nose
 * @author Reid Mozley
 */

public class Nose extends CharacterDecorator{
    

     /**
     * Pulls in the character class allowing us to contribute to the arraylist
     * @param character the character currently being customized with a nose
     */                              
    public Nose(Character character) {
        super(character);
    }

    /**
     * Customizes the character with a nose by adding it to the arraylist
     */
    public void customize(){
        String nose = " |   >    |"; 
        sections.set(4, nose); 
    }
}
