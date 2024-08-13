package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {

    public static void play(String userName) {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int nextInt = (int) (Math.random() * 100);
            String correctAnswer = isPrime(nextInt) ? "yes" : "no";
            System.out.println("Question: " + nextInt);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();
            Engine.checkingAnswer(userName, correctAnswer, userAnswer);
        }
        Engine.wining(userName);
    }
    public static boolean isPrime(int i) {
        int var = 2;
        if (i > 1) {
            while (i != var) {
                if (i % var != 0) {
                    var++;
                } else {
                    break;
                }
            }
            return var == i;
        } else {
            return false;
        }
    }
}
