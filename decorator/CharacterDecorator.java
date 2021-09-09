package decorator;

import java.util.ArrayList;

public abstract class CharacterDecorator extends Character {
    
    protected Character character;

    public CharacterDecorator(Character character){ 
        for(int i = 0; i < character.sections.size(); i++){
                this.sections.add(character.sections.get(i)); 
        }
        customize();
    }

    public abstract void customize(); 
}
