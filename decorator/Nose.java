package decorator;

public class Nose extends CharacterDecorator{
    


    public Nose(Character character) {
        super(character);
    }

    public void customize(){
        String nose = " |   >    |"; 
        sections.set(4, nose); 
    }
}
