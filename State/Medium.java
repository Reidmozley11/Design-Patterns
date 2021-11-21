import java.util.*; 
public class Medium implements State{
    private ArithemeticGame arithemeticGame; 
    Random r = new Random(); 

    /**
     * Instatiates the current game being played 
     * 
     * @param arithemeticGame the current user run game being played
     */
    public Medium(ArithemeticGame arithemeticGame) {
        this.arithemeticGame = arithemeticGame; 
    }

    /**
     * Returns a random number between 0-50
     */
    public int getNum() {
        return r.nextInt(50);
    }

 
    /**
     * Gets a random opertor between +, -, and *
     */
    public String getOperation() {
        int next = r.nextInt(2);
        String op = "";
        if (next == 0) {
            op = "+"; 
        } else if (next == 1) {
            op = "-"; 
        } else if (next == 2) {
            op = "*"; 
        }
        return op;
    }
  

    /**
     * Levels the game up 
     */
    public void levelUp() {
      System.out.println("Level Up!!!");
      arithemeticGame.setState(arithemeticGame.getHardState());
    }

    /**
     * Levels the game down 
     */
    public void levelDown() {
        System.out.println("Maybe you should study the basics again.");
        arithemeticGame.setState(arithemeticGame.getEasyState());
    }
    
}
