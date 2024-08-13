package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

import static hexlet.code.Engine.grittingUser;

public class App {
    public static void main(String[] args) {
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");

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
}


