package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Progression {

    public static void play(String userName) {
        System.out.println("What number is missing in the progression?");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Engine.getCountGames(); i++) {
            int first = Engine.getRandom();
            int step = Engine.getRandom();
            int count;
            do {
                count = Engine.getRandom();
            } while (count < Engine.getMinCount() || count > Engine.getMaxCount());
            System.out.print("Question: ");
            String correctAnswer = Engine.progressionLine(first, count, step);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            Engine.checkingAnswer(userName, correctAnswer, userAnswer);
        }
        Engine.wining(userName);
    }
}
