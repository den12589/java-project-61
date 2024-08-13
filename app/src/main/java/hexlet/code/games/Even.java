package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Even {

    public static void playEven(String userName) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int random = Engine.randomNum();
            String correctAnswer = random % 2 == 0 ? "yes" : "no";
            System.out.println("Question: " + random);
            String userAnswer = scanner.next();
            if (correctAnswer.equals(userAnswer)) {
                System.out.println("Correct!");
            } else {
                Engine.loosing(userName, userAnswer, correctAnswer);
            }
            Engine.wining(userName);
        }
    }
}


