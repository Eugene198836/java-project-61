package hexlet.code;

import java.util.Random;

public class Util {
    public static int random(int limitOfRandomNumber) {
        Random number = new Random();
        var numb = number.nextInt(limitOfRandomNumber);
        return numb;
    }
}
