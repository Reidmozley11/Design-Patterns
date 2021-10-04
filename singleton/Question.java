package singleton;

/**
 * A question with 4 answer choices and a correct answer bank
 * @author Reid Mozley
 */

public class Question {
    private String question;
    private String[] answers;
    private int correctAnswer;

    /**
     * Initializes the question 
     * @param question The actual question being asked
     * @param ans1 the first answer choice for the question being asked
     * @param ans2 the second answer choice for the question being asked
     * @param ans3 the third answer choice for the question being asked
     * @param ans4 the fourth answer choice for the question being asked
     * @param correctAnswer the correct choice for the question being asked
     */
    public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer) {
        this.question = question;
        answers = new String[4];
        this.answers[0] = ans1;
        this.answers[1] = ans2;
        this.answers[2] = ans3;
        this.answers[3] = ans4;
        this.correctAnswer = correctAnswer;
    }

    /**
     * Creates a string representation for the question
     * allows it to print to the console. 
     */
    public String toString() {
        String question = "";
        question += this.question + "\n";
        question += "1. " + answers[0] + "\n";
        question += "2. " + answers[1] + "\n";
        question += "3. " + answers[2] + "\n";
        question += "4. " + answers[3];
        return question;
    }

    /**
     * Checks if the users input is the correct answer
     * @param userAnswer The input that the user guesses is the answer
     * @return returns true if the users input is indeed correct
     * returns false if the users input is indeed false.
     */
    public boolean isCorrect(int userAnswer) {
        if (userAnswer == this.correctAnswer+1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Collects the correct answer and allows it to be called
     * @return returns the correct answer
     */ 
    public String getCorrectAnswer() {
        String sendCorrect = this.answers[this.correctAnswer];
        return sendCorrect;
    }
}
