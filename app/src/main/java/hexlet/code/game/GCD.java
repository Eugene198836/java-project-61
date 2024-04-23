package hexlet.code.game;
import java.util.Scanner;
import java.util.Random;

import hexlet.code.Engine;
import hexlet.code.FindGCD;
import hexlet.code.Util;

public class GCD {
    public static void gcd() {
// Вывод на экран приветствия.
        String name = Greet.introduce();
        System.out.println("Find the greatest common divisor of given numbers.");
        Engine.checkIntValues(name, "GCD");
    }
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    public static int createGCD() {
        final int limitOfRandomNumbers = 100;
        var random1 = Util.random(limitOfRandomNumbers);
        var random2 = Util.random(limitOfRandomNumbers);
        System.out.println("Question: " + random1 + " " + random2 );
        var result = GCD.calculateGCD(random1, random2);
        return result;
    }
}
