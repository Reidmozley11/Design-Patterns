import java.util.Random;

import java.util.*; 
/**
 * A virtual representation of an easy difficulty 
 */
public class Easy implements State{
    private ArithemeticGame arithemeticGame; 
    Random r = new Random(); 

    /**
     * Instatiates the current game being played 
     * 
     * @param arithemeticGame the current user run game being played
     */
    public Easy(ArithemeticGame arithemeticGame) {
        this.arithemeticGame = arithemeticGame; 
    }

    /**
     * Returns a random number between 0-10
     */
    public int getNum() {
        return r.nextInt(10);
    }

    /**
     * Gets a random opertor between + and - 
     */
    public String getOperation() {
        int next = r.nextInt(1);
        String op = "";
        if (next == 0) {
            op = "+"; 
        } else if (next == 1) {
            op = "-"; 
        }
        return op;
    }

    /**
     * Levels the game up 
     */
    public void levelUp() {
        System.out.println("Level Up!!!");
        arithemeticGame.setState(arithemeticGame.getMediumState());
    }

    /**
     * Levels the game down 
     */
    public void levelDown() {
        System.out.println("You seem to be struggling consider studying more");
    }
    
}
