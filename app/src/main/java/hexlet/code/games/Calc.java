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
        var first = new Random().nextInt(1, Engine.MAX_RANGE);
        var second = new Random().nextInt(1, Engine.MAX_RANGE);
        var operand = randomOperand();
        var question = first + " " + operand + " " + second;
        var correctAnswer = calculateAnswer(first, second, operand);
        return new String[]{question, String.valueOf(correctAnswer)};

    }

    private static int calculateAnswer(int first, int second, char operand) {
        return switch (operand) {
            case '+' -> first + second;
            case '-' -> first - second;
            case '*' -> first * second;
            default -> throw new RuntimeException("unknown operation");
        };
    }

    private static char randomOperand() {
        char[] operands = {'+', '-', '*'};
        return operands[(int) (Math.random() * operands.length)];
    }
}
