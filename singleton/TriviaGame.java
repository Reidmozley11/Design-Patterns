package singleton;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class TriviaGame {
    private static TriviaGame triviaGame;
    private int score;
    private Random rand;
    private Scanner reader;
    private ArrayList<Question> questions;

    private TriviaGame() {
        this.score = 0;
        questions = DataLoader.getTriviaQuestions();
        rand = new Random(10);
        reader = new Scanner(System.in);
        System.out.println("Welcome to the Trivia Game!");
    }

    public static TriviaGame getInstance() {
        if (triviaGame == null) {
            triviaGame = new TriviaGame();
        }
        return triviaGame;
    }

    public void play() {
        boolean go = true;
        while (go) {
            System.out.println("Play or quit? \n enter p to play and enter q to quit");
            String keepPlaying = reader.nextLine();
            if (keepPlaying.toLowerCase() == "p") {
                playRound();
            } else if (keepPlaying.toLowerCase() == "q") {
                System.out.println("Thanks for playing!!!" + "\n");
                System.out.println("Score: " + score);
                System.exit(0);
            } else {
                System.out.println("You entered something that is not valid, please try again.");
            }
        }
    }

    private boolean playRound() {
        System.out.println(questions.get(rand(10)));

    }
}
