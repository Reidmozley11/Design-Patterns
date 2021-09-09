package decorator;

public abstract class CharacterDecorator extends Character {
    
    protected Character characater;

    public CharacterDecorator(Character character){
        this.characater = character;
    }

    public abstract void customize(); 
}
