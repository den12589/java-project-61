package hexlet.code.games;

import java.util.Scanner;

import hexlet.code.Engine;

public class Calc {
    public static void playCalc(String userName) {
        System.out.println("What is the result of the expression?");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int first = Engine.randomNum();
            int second = Engine.randomNum();
            char operand = Engine.randomOperand();
            int rightAnswer = switch (operand) {
                case '+' -> first + second;
                case '-' -> first - second;
                default -> first * second;
            };
            System.out.println("Question: " + first + " " + operand + " " + second);
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();
            if (userAnswer == rightAnswer) {
                System.out.println("Correct!");
            } else {
                Engine.loosing(userName, userAnswer + "", rightAnswer + "");
            }
        }
        Engine.wining(userName);
    }
}
