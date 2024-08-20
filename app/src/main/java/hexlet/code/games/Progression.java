package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.StringJoiner;

public class Progression {

    private static final String RULES = "What number is missing in the progression?";

    public static void run() {
        var rounds = new String[Engine.ROUNDS][];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            rounds[i] = generateRound();
        }
        Engine.run(rounds, RULES);
    }

    private static String[] generateRound() {
        var first = new Random().nextInt(1, 100);
        var count = new Random().nextInt(5, 10);
        var step = new Random().nextInt(1, 100);
        return progressionLine(first, count, step);

    }

    public static String[] progressionLine(int first, int count, int step) {
        StringJoiner line = new StringJoiner(" ");
        int current = first;
        int questionStep = new Random().nextInt(1, count);
        int correctAnswer = 0;

        for (int i = 0; i < count; i++) {
            if (i == questionStep) {
                line.add("..");
                correctAnswer = current;
            } else {
                line.add(Integer.toString(current));
            }
            current += step;
        }
        return new String[]{line.toString(), String.valueOf(correctAnswer)};
    }

}
