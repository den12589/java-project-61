package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greet() {
        System.out.print("Welcome to the Brain Games!\n"
                +
                "May I have your name? ");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
