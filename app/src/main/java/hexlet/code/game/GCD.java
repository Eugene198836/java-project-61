package hexlet.code.game;
import hexlet.code.Engine;
import hexlet.code.Util;

public class GCD {
    // Метод вычисляет наибольший общий делитель (НОД) и
    // создает двумерный массив - 3 строки по 2 в каждой - с данными типа String и отправляет
// на проверку в класс Engine.
    public static void game() {
        String intro = "Find the greatest common divisor of given numbers.";
        String[][] numbers = getGCD();
        Engine.checkAnswers(numbers, intro);
    }
    private  static String[][] getGCD() {
        int rounds = Engine.getRoundNumber();
        String[][] numbers = new String[rounds][2];
        final int limitOfNumbers = 100;
        for (int i = 0; i < rounds; i++) {
            int random1 = Util.random(limitOfNumbers);
            int random2 = Util.random(limitOfNumbers);
            int gcdNumber = calculateGCD(random1, random2);
            String gcdNumberToString = Integer.toString(gcdNumber);
            numbers[i][0] = "Question: " + random1 + " " + random2;
            numbers[i][1] = gcdNumberToString;
        }
        return numbers;
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
