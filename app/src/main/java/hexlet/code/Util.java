package hexlet.code;

import java.util.Random;

public class Util {
    public static int generateRandomNumber(int begin, int end) {
        return new Random().nextInt(begin, end);
    }

    public static int generateRandomNumber(int begin) {
        return generateRandomNumber(begin, Engine.MAX_RANGE);
    }
}
