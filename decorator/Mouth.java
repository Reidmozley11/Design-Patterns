package decorator;

public class Mouth extends CharacterDecorator{


    public Mouth(Character character) {
        super(character);
    }

    public void customize(){
        String mouth = "  \\ ---- / ";
        sections.set(5, mouth); 
    }
    
}
