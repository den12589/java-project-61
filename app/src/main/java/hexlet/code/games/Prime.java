package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime extends Game {
    public void play() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int nextInt = (int) (Math.random() * 100);
            this.setCorrectAnswer(Engine.isPrime(nextInt) ? "yes" : "no");
            System.out.println("Question: " + nextInt);
            System.out.print("Your answer: ");
            this.setUserAnswer(scanner.nextLine());
            Engine.checkingAnswer(this);
        }
        Engine.wining(this);
    }
}
