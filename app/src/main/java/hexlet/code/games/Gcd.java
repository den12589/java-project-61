package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Util.generateRandomNumber;

public class Gcd {

    private static final String RULE_LINE = "Find the greatest common divisor of given numbers.";

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
        var question = first + " " + second;
        var correctAnswer = calculateGcd(first, second);
        return new String[]{question, String.valueOf(correctAnswer)};
    }

    private static int calculateGcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : calculateGcd(b, a % b);
    }

}
