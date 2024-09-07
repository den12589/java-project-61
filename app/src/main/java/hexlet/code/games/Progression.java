package hexlet.code.games;

import hexlet.code.Engine;

import java.util.StringJoiner;

import static hexlet.code.Util.generateRandomNumber;

public class Progression {

    private static final String RULE_LINE = "What number is missing in the progression?";
    private static final int MAX_STEP_COUNT = 10;
    private static final int MIN_STEP_COUNT = 5;

    public static void run() {
        var rounds = new String[Engine.ROUNDS][];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            rounds[i] = generateRound();
        }
        Engine.run(rounds, RULE_LINE);
    }

    private static String[] generateRound() {
        var first = generateRandomNumber(1);
        var count = generateRandomNumber(MIN_STEP_COUNT, MAX_STEP_COUNT);
        var step = generateRandomNumber(1);
        String[] questionProgression = generateProgression(first, count, step);
        var questionStep = generateRandomNumber(0, count);
        StringJoiner line = new StringJoiner(" ");
        String correctAnswer = "";
        for (int i = 0; i < questionProgression.length; i++) {
            if (i == questionStep) {
                line.add("..");
                correctAnswer = String.valueOf(questionProgression[i]);
            } else {
                line.add(questionProgression[i]);
            }
        }
        return new String[]{line.toString(), correctAnswer};
    }

    public static String[] generateProgression(int first, int count, int step) {
        String[] result = new String[count];
        int current = first;
        for (int i = 0; i < count; i++) {
            result[i] = Integer.toString(current);
            current += step;
        }
        return result;
    }
}
