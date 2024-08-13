package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {
    private final String userName;

    public Prime() {
        userName = Engine.grittingUser();
    }

    public String getUserName() {
        return userName;
    }


    public void play() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int nextInt = (int) (Math.random() * 100);
            String correctAnswer = Engine.isPrime(nextInt) ? "yes" : "no";
            System.out.println("Question: " + nextInt);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();
            Engine.checkingAnswer(getUserName(), correctAnswer, userAnswer);
        }
        Engine.wining(getUserName());
    }
}
