package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {

    public static void play(String userName) {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Engine.getCountGames(); i++) {
            int nextInt = Engine.getRandom();
            String correctAnswer = Engine.isPrime(nextInt) ? "yes" : "no";
            System.out.println("Question: " + nextInt);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();
            Engine.checkingAnswer(userName, correctAnswer, userAnswer);
        }
        Engine.wining(userName);
    }
}
