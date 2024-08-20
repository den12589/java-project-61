package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {

    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void run() {
        var rounds = new String[Engine.ROUNDS][];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            rounds[i] = generateRound();
        }
        Engine.run(rounds, RULES);
    }

    private static String[] generateRound() {
        var question = new Random().nextInt(1, 100);
        var correctAnswer = isEven(question) ? "yes" : "no";
        return new String[]{String.valueOf(question), correctAnswer};
    }

    private static boolean isEven(int i) {
        return i % 2 == 0;
    }
}


