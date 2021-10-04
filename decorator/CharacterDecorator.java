package decorator;
/**
 * A decorating program which applies the customizations
 * requires other classes to apply customize(); 
 * @author Reid Mozley
 */

import java.util.ArrayList;

public abstract class CharacterDecorator extends Character {
    
    protected Character character;
    
    /**
     * iterates through the array replacing the current character with a customized character
     * to the users desire. 
     * @param character the character being created  
     */
    public CharacterDecorator(Character character){ 
        for(int i = 0; i < character.sections.size(); i++){
            this.sections.add(character.sections.get(i)); 
        }
        customize();
    }

    public abstract void customize(); 
}
