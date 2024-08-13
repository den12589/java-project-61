package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

import static hexlet.code.Engine.takeGCD;

public class GCD extends Game {

    public void play() {
        System.out.println("Find the greatest common divisor of given numbers.");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int first = (int) (Math.random() * 100);
            int second = (int) (Math.random() * 100);
            this.setCorrectAnswer(takeGCD(first, second));
            System.out.println("Question: " + first + " " + second);
            System.out.print("Your answer: ");
            this.setUserAnswer(sc.nextLine());
            Engine.checkingAnswer(this);
        }
        Engine.wining(this);
    }
}
