package singleton;

public class Question {
    private String question;
    private String[] answers;
    private int correctAnswer;

    public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer) {
        this.question = question;
        answers[0] = ans1;
        answers[1] = ans2;
        answers[2] = ans3;
        answers[3] = ans4;
        this.correctAnswer = correctAnswer;
    }

    public String toString() {
        String question = "";
        question += this.question + "\n";
        question += "1. " + answers[0] + "\n";
        question += "2. " + answers[1] + "\n";
        question += "3. " + answers[2] + "\n";
        question += "4. " + answers[3];
        return question;
    }

    public boolean isCorrect(int userAnswer) {
        if (userAnswer == correctAnswer) {
            System.out.println("You got the question correct! Congratulations!");
            return true;
        } else {
            System.out.println("You got the question incorrect." + "\n");
            getCorrectAnswer();
            return false;
        }
    }

    public String getCorrectAnswer() {
        String sendCorrect = "";
        sendCorrect = answers[correctAnswer - 1];
        return sendCorrect;
    }
}
