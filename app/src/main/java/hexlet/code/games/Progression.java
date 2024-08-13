package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;
import java.util.StringJoiner;

public class Progression {

    public static void play(String userName) {
        System.out.println("What number is missing in the progression?");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int first = (int) (Math.random() * 100);
            int step = (int) (Math.random() * 100);
            int count;
            do {
                count = (int) (Math.random() * 10);
            } while (count < 5 || count > 10);
            System.out.print("Question: ");
            String correctAnswer = progressionLine(first, count, step);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            Engine.checkingAnswer(userName, correctAnswer, userAnswer);
        }
        Engine.wining(userName);
    }
    public static String progressionLine(int first, int count, int step) {
        StringJoiner result = new StringJoiner(" ");
        int current = first;
        int questionStep;
        int correctAnswer = 0;
        do {
            questionStep = Math.abs((int) (Math.random() * 10));
        } while (questionStep >= count);

        for (int i = 0; i < count; i++) {
            if (i == questionStep) {
                result.add("..");
                correctAnswer = current;
            } else {
                result.add(Integer.toString(current));
            }
            current += step;
        }
        System.out.println(result);
        return Integer.toString(correctAnswer);
    }
}
