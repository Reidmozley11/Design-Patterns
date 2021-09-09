package decorator;

public class Hat extends CharacterDecorator{
    


    public Hat(Character character) {
        super(character);
    }

    public void customize(){
        String hatTop = "    ____";
        String hatBot = " __|____|____";
        sections.add(hatTop);
        sections.add(hatBot); 
    }
}
