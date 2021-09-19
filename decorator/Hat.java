package decorator;
/**
 * A virtual representaion of a customers best selling book wishlist
 * @author Reid Mozley
 */

public class Hat extends CharacterDecorator{                       
                                                                                                                                        
    /**
     * Pulls in the character class allowing us to contribute to the arraylist
     * @param character the character currently being customized with a hat
     */                                                                                                                               
    public Hat(Character character) {
        super(character);
    }

    /**
     * Customizes the character with a hat by adding it to the arraylist
     */
    public void customize(){
        String hatTop = "    ____";
        String hatBot = " __|____|____";
        sections.set(0, hatTop);
        sections.set(1,hatBot); 
    }
}
