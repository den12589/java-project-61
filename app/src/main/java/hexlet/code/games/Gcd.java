package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Gcd {

    private static final String RULES = "Find the greatest common divisor of given numbers.";

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
        var question = first + " " + second;
        var correctAnswer = gcd(first, second);
        return new String[]{question, String.valueOf(correctAnswer)};
    }

    private static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }

}
