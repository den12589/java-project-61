package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {

    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void run() {
        var rounds = new String[Engine.ROUNDS][];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            rounds[i] = generateRound();
        }
        Engine.run(rounds, RULES);
    }

    private static String[] generateRound() {
        var question = new Random().nextInt(1, Engine.MAX_RANGE);
        var correctAnswer = isPrime(question) ? "yes" : "no";
        return new String[]{String.valueOf(question), correctAnswer};
    }

    private static boolean isPrime(int i) {
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
