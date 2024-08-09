package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String userName(){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        scanner.close();
        return name;
    }
}
