package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class Engine {
    public static String grittingUser() {
        System.out.println("Welcome to the Brain Games!\n"
                +
                "May I have your name? ");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    public static void wining(String userName) {
        System.out.println("Congratulations, " + userName);
        System.exit(0);
    }

    public static void loosing(String userName, String userAnswer, String correctAnswer) {
        System.out.println("'" + userAnswer + "'"
                + " is wrong answer ;(. Correct answer was "
                + "'" + correctAnswer + "'" + ".\n");
        System.out.println("Let's try again, " + userName + "!");
        System.exit(0);
    }

    public static void start(int numberOfGame) {

        switch (numberOfGame) {
            case 1:
                grittingUser();
                break;
            case 2:
                Even.playEven(grittingUser());
                break;
            case 3:
                Calc.playCalc(grittingUser());
                break;
            default:
                System.exit(0);
        }
    }

    public static int randomNum() {
        return (int) (Math.random() * 100);
    }

    public static char randomOperand() {
        int i = randomNum();
        if (i < 33) {
            return '+';
        }
        if (i < 66) {
            return '-';
        }
        return '*';
    }
}
