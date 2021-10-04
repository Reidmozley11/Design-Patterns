package singleton;

/**
 * A virtual trivia game program
 * @author Reid Mozley
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TriviaGame {
    private static TriviaGame triviaGame;
    private int score;
    private Random rand;
    private Scanner reader;
    private ArrayList<Question> questions;

    /**
     * Creates a instance of TriviaGame to be ran 
     * sets things to their default values and fills the question bank.
     */
    private TriviaGame() {
        score = 0;
        questions = DataLoader.getTriviaQuestions();
        rand = new Random();
        reader = new Scanner(System.in);
        System.out.println("Welcome to the Trivia Game!");
    }

    /**
     * Returns a type trivia game to allow us to play 
     * @return Returns a type trivia game
     */
    public static TriviaGame getInstance() {
        triviaGame = new TriviaGame();
        return triviaGame;
    }

    /**
     * Plays the game for as long as the user keeps inputting 
     * play and will exit if the user inputs q. 
     */
    public void play() {
        boolean go = true;
        while (go) {
            System.out.println("Play or quit? \nenter p to play and enter q to quit");
            String keepPlaying = reader.nextLine();
            if (keepPlaying.equalsIgnoreCase("P")) {
                playRound();
            } else if (keepPlaying.equalsIgnoreCase("Q")) {
                System.out.println("Thanks for playing!!!" + "\n");
                System.out.println("Score: " + score);
                System.exit(0);
            } else {
                System.out.println("You entered something that is not valid, please try again.");
            }
        }
    }

    /**
     * Prints a random question out at the user 
     * and reads in their input. If the user is correct
     * it increases score by one. If the user is incorrect 
     * the system outputs the correct answer. 
     * @return returns true if the user is correct and false if the user is incorrect.
     */
    private boolean playRound() {
        Question question = questions.get(rand.nextInt(10));
        System.out.println(question);
        System.out.println("Please enter an answer: \n");;
        
        int userAnswer = reader.nextInt(); 
        reader.nextLine();
        if (userAnswer <= 4) {
            if(question.isCorrect(userAnswer)) {
                System.out.println("You got the question correct! Congratulations!");
                score++; 
                return true; 
            } else {
                System.out.println("This answer was incorrect heres your correct answer: ");
                System.out.println(question.getCorrectAnswer());
                return false; 
            }
        } else {
            System.out.println("That answer choice is out of bounds please try again. ");
            return false; 
        }
    }
}
