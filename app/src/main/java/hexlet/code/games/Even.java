package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Even extends Game {

    public void play() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int random = (int) (Math.random() * 100);
            this.setCorrectAnswer(random % 2 == 0 ? "yes" : "no");
            System.out.println("Question: " + random);
            System.out.print("Your answer: ");
            this.setUserAnswer(scanner.next());
            Engine.checkingAnswer(this);
        }
        Engine.wining(this);
    }
}


