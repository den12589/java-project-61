package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Even {
    private final String userName;

    public Even() {
        userName = Engine.grittingUser();
    }

    public String getUserName() {
        return userName;
    }

    public void play() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int random = (int) (Math.random() * 100);
            String correctAnswer = (random % 2 == 0 ? "yes" : "no");
            System.out.println("Question: " + random);
            System.out.print("Your answer: ");
            String userAnswer =  scanner.next();
            Engine.checkingAnswer(getUserName(), correctAnswer, userAnswer);
        }
        Engine.wining(getUserName());
    }
}


