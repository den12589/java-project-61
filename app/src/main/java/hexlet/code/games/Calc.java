package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Util.generateRandomNumber;

public class Calc {

    private static final String RULE_LINE = "What is the result of the expression?";
    private static final char[] OPERANDS = {'+', '-', '*'};

    public static void run() {
        var rounds = new String[Engine.ROUNDS][];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            rounds[i] = generateRound();
        }
        Engine.run(rounds, RULE_LINE);
    }

    private static String[] generateRound() {
        var first = generateRandomNumber(1);
        var second = generateRandomNumber(1);
        var operand = takeOperand();
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

    private static char takeOperand() {
        return OPERANDS[(generateRandomNumber(0, OPERANDS.length))];
    }
}
