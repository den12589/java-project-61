package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

import static hexlet.code.Engine.takeGCD;

public class GCD {
    private final String userName;

    public GCD() {
        userName = Engine.grittingUser();
    }

    public String getUserName() {
        return userName;
    }

    public void play() {
        System.out.println("Find the greatest common divisor of given numbers.");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int first = (int) (Math.random() * 100);
            int second = (int) (Math.random() * 100);
            String correctAnswer = takeGCD(first, second);
            System.out.println("Question: " + first + " " + second);
            System.out.print("Your answer: ");
            String userAnswer = sc.nextLine();
            Engine.checkingAnswer(getUserName(), correctAnswer, userAnswer);
        }
        Engine.wining(getUserName());
    }
}
