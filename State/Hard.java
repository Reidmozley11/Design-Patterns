import java.util.*; 
public class Hard implements State{
    private ArithemeticGame arithemeticGame; 
    Random r = new Random(); 

    /**
     * Instatiates the current game being played 
     * 
     * @param arithemeticGame the current user run game being played
     */
    public Hard(ArithemeticGame arithemeticGame) {
        this.arithemeticGame = arithemeticGame; 
    }

    /**
     * Returns a random number between 0-100
     */
    public int getNum() {
        return r.nextInt(100);
    }

 
    /**
     * Gets a random opertor between +,-,*, and /
     */
    public String getOperation() {
        int next = r.nextInt(3);
        String op = "";
        if (next == 0) {
            op = "+"; 
        } else if (next == 1) {
            op = "-"; 
        } else if (next == 2) {
            op = "*"; 
        } else if (next == 3) {
            op = "/"; 
        }
        return op;
    }


    /**
     * Levels the game up 
     */
    public void levelUp() {
        System.out.println("You're really killing it! I am impressed!");
    }

    /**
     * Levels the game down 
     */
    public void levelDown() {
        System.out.println("Seems these new concepts are hard lets keep studying the previous information");
        arithemeticGame.setState(arithemeticGame.getMediumState());
    }
    
}
