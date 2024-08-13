package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Progression {
    private final String userName;

    public Progression() {
        userName = Engine.grittingUser();
    }

    public String getUserName() {
        return userName;
    }


    public void play() {
        System.out.println("What number is missing in the progression?");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int first = (int) (Math.random() * 100);
            int step = (int) (Math.random() * 100);
            int count;
            do {
                count = (int) (Math.random() * 10);
            } while (count < 5 || count > 10);
            System.out.print("Question: ");
            String correctAnswer = Engine.progressionLine(first, count, step);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            Engine.checkingAnswer(getUserName(), correctAnswer, userAnswer);
        }
        Engine.wining(getUserName());
    }
}
