package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GCD {
    public static void playGCD(String userName) {
        System.out.println("Find the greatest common divisor of given numbers.");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int first = Engine.randomNum();
            int second = Engine.randomNum();
            int correctAnswer = takeGCD(first, second);
            System.out.println("Question: " + first + " " + second);
            System.out.print("Your answer: ");
            String userAnswer = sc.nextLine();
            Engine.checkingAnswer(userName, userAnswer, Integer.toString(correctAnswer));
        }
        Engine.wining(userName);
    }

    public static int takeGCD(int first, int second) {
        int gcd = 1;
        for (int i = 1; i <= first && i <= second; i++) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
