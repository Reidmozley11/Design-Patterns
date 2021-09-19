package decorator;
/**
 * A virtual representaion of eyes 
 * @author Reid Mozley
 */

public class Eyes extends CharacterDecorator{
   
     /**
     * Pulls in the character class allowing us to contribute to the arraylist
     * @param character the character currently being customized with a eyes
     */                              
    public Eyes(Character character){
        super(character);
    }

    /**
     * Customizes the character with a set of eyes by adding it to the arraylist
     */
    public void customize(){
        String eyes = " |  o  o  |";
        sections.set(3, eyes); 
    }
}
