package decorator;
/**
 * A virtual representaion of a mouth
 * @author Reid Mozley
 */

public class Mouth extends CharacterDecorator{

    /**
     * Pulls in the character class allowing us to contribute to the arraylist
     * @param character the character currently being customized with a mouth
     */                              
    public Mouth(Character character) {
        super(character);
    }

     /**
     * Customizes the character with a mouth by adding it to the arraylist
     */
    public void customize(){
        String mouth = "  \\ ---- / ";
        sections.set(5, mouth); 
    }
    
}
