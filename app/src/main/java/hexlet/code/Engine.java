package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;
import java.util.StringJoiner;

public class Engine {

    private final static int maxCountInLine = 10;
    private final static int minCountInLine = 5;
    private final static int maxValueNum = 5;
    private final static int gamesCount = 3;

    public static void start() {
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                grittingUser();
                break;
            case 2:
                Even.play(grittingUser());
                break;
            case 3:
                Calc.play(grittingUser());
                break;
            case 4:
                GCD.play(grittingUser());
                break;
            case 5:
                Progression.play(grittingUser());
                break;
            case 6:
                Prime.play(grittingUser());
            default:
                System.exit(0);
        }
    }

    public static String grittingUser() {
        System.out.print("Welcome to the Brain Games!\n"
                +
                "May I have your name? ");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    public static void checkingAnswer(String userName, String correctAnswer, String userAnswer) {
        if (correctAnswer.equals(userAnswer)) {
            System.out.println("Correct!");
        } else {
            Engine.loosing(userName, correctAnswer, userAnswer);
        }
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

    public static int getCountGames() {
        return gamesCount;
    }

    public static int getRandom() {
        return (int) (Math.random() * maxValueNum);
    }

    public static char randomOperand() {
        char[] operands = {'+', '-', '*'};
        return operands[(int) (Math.random() * operands.length)];
    }

    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }

    public static String progressionLine(int first, int count, int step) {
        StringJoiner result = new StringJoiner(" ");
        int current = first;
        int questionStep;
        int correctAnswer = 0;
        do {
            questionStep = maxValueNum;
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

    public static int getMinCount() {
        return minCountInLine;
    }

    public static int getMaxCount() {
        return maxCountInLine;
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
