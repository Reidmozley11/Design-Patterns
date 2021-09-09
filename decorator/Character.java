package decorator;

import java.util.ArrayList;

public class Character {
    
    protected ArrayList<String> sections; 

    public Character(){
        this.sections = new ArrayList<>(); 
    }

    public void draw(){
        for(String string : sections){
            System.out.println(string);
        }
    }
}
