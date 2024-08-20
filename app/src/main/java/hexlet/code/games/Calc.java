package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {

    private static final String RULES = "What is the result of the expression?";

    public static void run() {
        var rounds = new String[Engine.ROUNDS][];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            rounds[i] = generateRound();
        }
        Engine.run(rounds, RULES);
    }

    private static String[] generateRound() {
        var first = new Random().nextInt(1, 100);
        var second = new Random().nextInt(1, 100);
        var operand = randomOperand();
        var question = first + " " + operand + " " + second;
        int i;
        switch (operand) {
            case '+':
                i = first + second;
            case '-':
                i = first - second;
            default:
                i = first * second;
        }
        String correctAnswer = Integer.toString(i);
        return new String[]{question, correctAnswer};
    }

    private static char randomOperand() {
        char[] operands = {'+', '-', '*'};
        return operands[(int) (Math.random() * operands.length)];
    }

}
