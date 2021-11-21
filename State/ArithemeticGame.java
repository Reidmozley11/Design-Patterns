import java.util.Scanner;
/**
 * A virtual representation af a simple arithemetic game
 */
public class ArithemeticGame {
    private State easyState; 
    private State mediumState;
    private State hardState;
    private State state;
    
    private int score; 
    private Scanner reader; 

    /**
     * Sets the default values and instantiates the game 
     */
    public ArithemeticGame() {
        score = 0; 
        easyState = new Easy(this); 
        mediumState = new Medium(this); 
        hardState = new Hard(this);
        state = easyState;
    }

    /**
     * Acts as a play button, it figures out what the 
     * users input is and it analyzes what the answer 
     * to the math is. If the user is correct it will increase the 
     * users score by 1 and if the user is incorrect it will
     * decrease the users score by 1. 
     */
    public void pressQuestionButton() {
        reader = new Scanner(System.in); 
        int num1 = state.getNum(); 
        int num2 = state.getNum(); 
        String op = state.getOperation(); 
        System.out.println(num1 + " " + op + " " + num2 + " = ");
        int choice = reader.nextInt();
        int answer = 0; 
        if (op == "+") {
            answer = num1 + num2; 
        } else if (op == "-") {
            answer = num1 - num2;
        } else if (op == "*") {
            answer = num1 * num2;
        } else if (op == "/") {
            answer = num1 / num2; 
        }

        if (answer == choice) {
            System.out.println("Correct! :)");
            score++; 
        } else {
            System.out.println("Incorrect :(");
            score--; 
        }

        if (score >= 3) {
            state.levelUp();
            score = 0; 
        } else if(score <= -3) {
            state.levelDown(); 
            score = 0; 
        }
    }
    
    /**
     * Sets the difficulty of the game
     * 
     * @param state The state being upgraded or downgraded to
     */
    public void setState(State state) {
        this.state = state; 
    }

    /**
     * Returns the easy difficulty 
     * @return
     */
    public State getEasyState() {
        return easyState;

    }

    /**
     * Returns the medium difficulty 
     * @return
     */
    public State getMediumState() {
        return mediumState;

    }

    /**
     * Returns the hard difficulty 
     * @return
     */
    public State getHardState() {
        return hardState;

    }
}