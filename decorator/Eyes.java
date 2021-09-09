package decorator;

public class Eyes extends CharacterDecorator{
   

    public Eyes(Character character){
        super(character);
        this.characater = character; 
    }

    public void customize(){
        String eyes = "|  o  o  |";
        sections.add(eyes); 
    }
}
