package hexlet.code;

import java.util.Scanner;

public class Game {

    private static String gritting() {
        System.out.println("Welcome to the Brain Games!\n"
                +
                "May I have your name? ");
        String userName = Cli.userName();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    private static void playEven(String userName) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (i == 3) {
                System.out.println("Congratulations, " + userName);
                break;
            }
            int random = (int) (Math.random() * 100);
            String correctAnswer = random % 2 == 0 ? "yes" : "no";

            System.out.println("Question: " + random);
            String userAnswer = scanner.next();
            if (correctAnswer.equals(userAnswer)) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println("'" + userAnswer + "'"
                        + " is wrong answer ;(. Correct answer was "
                        + "'" + correctAnswer + "'" + ".\n"
                        + "Let's try again, " + userName + "!");
                break;
            }
        }
    }

    public static void start(int numberOfGame) {
        String userName = gritting();
        if (numberOfGame == 2) {
            playEven(userName);
        }
    }
}


