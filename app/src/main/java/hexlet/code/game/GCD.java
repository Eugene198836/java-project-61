package hexlet.code.game;
import hexlet.code.Engine;
import hexlet.code.Util;

public class GCD {
    public static void gcd() {
// Вывод на экран приветствия.
        String userName = Engine.introduce();
        System.out.println("Find the greatest common divisor of given numbers.");
        final int numberOfQuestions = 3;
        String[][] numbers = new String[numberOfQuestions][2];
        final int rounds = 3;
        final int limitOfNumbers = 100;
        for (int i = 0; i < rounds; i++) {
            int random1 = Util.random(limitOfNumbers);
            int random2 = Util.random(limitOfNumbers);
            int gcdNumber = calculateGCD(random1, random2);
            String gcdNumberToString = Integer.toString(gcdNumber);
            numbers[i][0] = "Question: " + random1 + " " + random2;
            numbers[i][1] = gcdNumberToString;
        }
        Engine.checkAnswers(numbers, userName);
    }
    public static int calculateGCD(int a, int b) { // Вычисляем наибольший общий делитель
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
