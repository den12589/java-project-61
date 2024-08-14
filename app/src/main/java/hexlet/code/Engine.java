package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String grittingUser() {
        System.out.print("Welcome to the Brain Games!\n"
                +
                "May I have your name? ");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    public static void wining(String userName) {
        System.out.print("Congratulations, " + userName + "!");
        System.exit(0);
    }

    public static void loosing(String userName, String correctAnswer, String userAnswer) {
        System.out.println("'" + userAnswer + "'"
                + " is wrong answer ;(. Correct answer was "
                + "'" + correctAnswer + "'" + ".\n");
        System.out.println("Let's try again, " + userName + "!");
        System.exit(0);
    }

    public static void checkingAnswer(String userName, String correctAnswer, String userAnswer) {
        if (correctAnswer.equals(userAnswer)) {
            System.out.println("Correct!");
        } else {
            Engine.loosing(userName, correctAnswer, userAnswer);
        }
    }


}
