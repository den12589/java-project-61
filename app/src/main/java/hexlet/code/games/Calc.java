package hexlet.code.games;

import java.util.Scanner;

import hexlet.code.Engine;

public class Calc {
    private final String userName;

    public Calc() {
        userName = Engine.grittingUser();
    }

    public String getUserName() {
        return userName;
    }

    public void play() {
        System.out.println("What is the result of the expression?");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int first = (int) (Math.random() * 100);
            int second = (int) (Math.random() * 100);
            char operand = Engine.randomOperand();
            String correctAnswer = Integer.toString(
                switch (operand) {
                    case '+' -> first + second;
                    case '-' -> first - second;
                    default -> first * second;
                });
            System.out.println("Question: " + first + " " + operand + " " + second);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();
            Engine.checkingAnswer(getUserName(), correctAnswer, userAnswer);
        }
        Engine.wining(getUserName());
    }
}
