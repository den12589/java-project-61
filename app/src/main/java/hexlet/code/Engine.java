package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int ROUNDS = 3;
    public static final int MAX_RANGE = 100;

    public static void run(String[][] rounds, String rules) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\n"
                +
                "May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rules);
        for (String[] round : rounds) {
            System.out.println("Question: " + round[0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            if (userAnswer.equals(round[1])) {
                System.out.println("Correct!");
            } else {
                loosing(userName, round[1], userAnswer);
                return;
            }
        }
        wining(userName);
    }

    public static void wining(String userName) {
        System.out.println("Congratulations, " + userName + "!");
    }

    public static void loosing(String userName, String correctAnswer, String userAnswer) {
        System.out.println("'" + userAnswer + "'"
                + " is wrong answer ;(. Correct answer was "
                + "'" + correctAnswer + "'" + ".\n");
        System.out.println("Let's try again, " + userName + "!");
    }
}
