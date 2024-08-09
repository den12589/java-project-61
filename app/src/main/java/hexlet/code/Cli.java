package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String userName() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
