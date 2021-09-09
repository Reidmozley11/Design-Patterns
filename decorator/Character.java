package decorator;
/**
 * A virtual representation of a character, also displays the character.
 * @author Reid Mozley
 */

import java.util.ArrayList;

public class Character {
    
    protected ArrayList<String> sections; 

    public Character(){
        this.sections = new ArrayList<>(); 
    }

    /**
     * Iterates through the sections arraylist printing out all the strings which 
     * compose of the current character being created custom or not. 
     */
    public void draw(){
        for(String string : sections){
            System.out.println(string);
        }
    }
}
