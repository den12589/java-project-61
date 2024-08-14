package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;
import java.util.StringJoiner;

public class Engine {

    private static final int GRIT = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD = 4;
    private static final int PROGRESS = 5;
    private static final int PRIME = 6;

    private static final  int MAX_COUNT_IN_LINE = 10;
    private static final int MIN_COUNT_IN_LINE = 5;
    private static final  int MAX_VALUE_NUM = 100;
    private static final  int ROUNDS = 3;

    public static void start() {
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case GRIT:
                grittingUser();
                break;
            case EVEN:
                Even.play(grittingUser());
                break;
            case CALC:
                Calc.play(grittingUser());
                break;
            case GCD:
                Gcd.play(grittingUser());
                break;
            case PROGRESS:
                Progression.play(grittingUser());
                break;
            case PRIME:
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
        return ROUNDS;
    }

    public static int getRandom() {
        return (int) (Math.random() * MAX_VALUE_NUM);
    }

    public static int getRandomCount() {
        return (int) (Math.random() * MAX_COUNT_IN_LINE);
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
            questionStep = getRandomCount();
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
        return MIN_COUNT_IN_LINE;
    }

    public static int getMaxCount() {
        return MAX_COUNT_IN_LINE;
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
