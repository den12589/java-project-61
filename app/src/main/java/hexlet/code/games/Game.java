package hexlet.code.games;

import static hexlet.code.Engine.grittingUser;

public abstract class Game {
    private final String userName;
    private String correctAnswer;
    private String userAnswer;

    public Game() {
        userName = grittingUser();
    }

    public String getUserName() {
        return userName;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    public void play() {
    }
}
