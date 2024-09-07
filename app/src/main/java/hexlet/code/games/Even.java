package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Util.generateRandomNumber;

public class Even {

    private static final String RULE_LINE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void run() {
        var rounds = new String[Engine.ROUNDS][];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            rounds[i] = generateRound();
        }
        Engine.run(rounds, RULE_LINE);
    }

    private static String[] generateRound() {
        var question = generateRandomNumber(1);
        var correctAnswer = isEven(question) ? "yes" : "no";
        return new String[]{String.valueOf(question), correctAnswer};
    }

    private static boolean isEven(int i) {
        return i % 2 == 0;
    }
}


