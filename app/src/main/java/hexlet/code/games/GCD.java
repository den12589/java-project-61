package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GCD {

    public static void play(String userName) {
        System.out.println("Find the greatest common divisor of given numbers.");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < Engine.getCountGames(); i++) {
            int first = Engine.getRandom();
            int second = Engine.getRandom();
            String correctAnswer = Integer.toString(Engine.gcd(first, second));
            System.out.println("Question: " + first + " " + second);
            System.out.print("Your answer: ");
            String userAnswer = sc.nextLine();
            Engine.checkingAnswer(userName, correctAnswer, userAnswer);
        }
        Engine.wining(userName);
    }
}
