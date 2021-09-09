package decorator;

public abstract class CharacterDecorator extends Character {
    
    protected Character characater;

    public CharacterDecorator(Character character){
        this.characater = character; 
        for(String string : sections){
            this.sections.add(string); 
        }
        customize();
    }

    public abstract void customize(); 
}
