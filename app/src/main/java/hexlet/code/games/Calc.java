package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;


public class Calc {

    public static void play(String userName) {
        System.out.println("What is the result of the expression?");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int first = (int) (Math.random() * 100);
            int second = (int) (Math.random() * 100);
            char operand = randomOperand();
            String correctAnswer = Integer.toString(
                switch (operand) {
                    case '+' -> first + second;
                    case '-' -> first - second;
                    default -> first * second;
                });
            System.out.println("Question: " + first + " " + operand + " " + second);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();
            Engine.checkingAnswer(userName, correctAnswer, userAnswer);
        }
        Engine.wining(userName);
    }
    public static char randomOperand() {
        int i = (int) (Math.random() * 100);
        if (i < 33) {
            return '+';
        }
        if (i < 66) {
            return '-';
        }
        return '*';
    }
}
