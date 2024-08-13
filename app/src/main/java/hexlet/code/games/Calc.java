package hexlet.code.games;

import java.util.Scanner;

import hexlet.code.Engine;

public class Calc extends Game {

    public void play() {
        System.out.println("What is the result of the expression?");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int first = (int) (Math.random() * 100);
            int second = (int) (Math.random() * 100);
            char operand = Engine.randomOperand();
            this.setCorrectAnswer(Integer.toString(
                    switch (operand) {
                        case '+' -> first + second;
                        case '-' -> first - second;
                        default -> first * second;
                    }));
            System.out.println("Question: " + first + " " + operand + " " + second);
            System.out.print("Your answer: ");
            this.setUserAnswer(scanner.nextLine());
            Engine.checkingAnswer(this);
        }
        Engine.wining(this);
    }
}
