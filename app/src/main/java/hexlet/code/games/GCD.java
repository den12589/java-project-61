package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GCD {

    public static void play(String userName) {
        System.out.println("Find the greatest common divisor of given numbers.");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int first = (int) (Math.random() * 100);
            int second = (int) (Math.random() * 100);
            String correctAnswer = takeGCD(first, second);
            System.out.println("Question: " + first + " " + second);
            System.out.print("Your answer: ");
            String userAnswer = sc.nextLine();
            Engine.checkingAnswer(userName, correctAnswer, userAnswer);
        }
        Engine.wining(userName);
    }
    public static String takeGCD(int first, int second) {
        int gcd = 1;
        for (int i = 1; i <= first && i <= second; i++) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
        }
        return Integer.toString(gcd);
    }
}
