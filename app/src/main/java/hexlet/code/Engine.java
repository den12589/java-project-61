package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.games.Game;

import java.util.Scanner;
import java.util.StringJoiner;

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

    public static void wining(Game game) {
        System.out.println("Congratulations, " + game.getUserName());
        System.exit(0);
    }

    public static void loosing(Game game) {
        System.out.println("'" + game.getUserAnswer() + "'"
                + " is wrong answer ;(. Correct answer was "
                + "'" + game.getCorrectAnswer() + "'" + ".\n");
        System.out.println("Let's try again, " + game.getUserName() + "!");
        System.exit(0);
    }

    public static void start(int numberOfGame) {

        switch (numberOfGame) {
            case 1:
                grittingUser();
                break;
            case 2:
                new Even().play();
                break;
            case 3:
                new Calc().play();
                break;
            case 4:
                new GCD().play();
                break;
            case 5:
                new Progression().play();
                break;
            case 6:
                new Prime().play();
            default:
                System.exit(0);
        }
    }

    public static char randomOperand() {
        int i = (int) (Math.random() * 100);
        if (i < 33) {
            return '+';
        }
        if (i < 66) {
            return '-';
        }
        return '*';
    }

    public static void checkingAnswer(Game game) {
        if (game.getCorrectAnswer().equals(game.getUserAnswer())) {
            System.out.println("Correct!");
        } else {
            Engine.loosing(game);
        }
    }

    public static String takeGCD(int first, int second) {
        int gcd = 1;
        for (int i = 1; i <= first && i <= second; i++) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
        }
        return Integer.toString(gcd);
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

    public static boolean isPrime(int i) {
        int var = 2;
        if (i > 1) {
            while (i != var) {
                if (i % var != 0) {
                    var++;
                } else {
                    break;
                }
            }
            return var == i;
        } else {
            return false;
        }
    }
}
