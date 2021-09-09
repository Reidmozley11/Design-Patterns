package decorator;

public class PotatoeHead extends Character{
    public PotatoeHead(){
        String bHead =  "            ";
        String bEyes1 = "  /      \\ "; 
        String bEyes2 = " |  o  o  | ";
        String bNose  = " |        | ";
        String bMouth1 =" \\      /  ";
        String bMouth2 ="  \\____/   ";
        sections.add(bHead); 
        sections.add(bEyes1); 
        sections.add(bEyes2); 
        sections.add(bNose); 
        sections.add(bMouth1); 
        sections.add(bMouth2); 
    }
}
