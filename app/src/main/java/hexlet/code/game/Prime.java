package hexlet.code.game;
import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
// Метод создает двумерный массив - 3 строки по 2 в каждой - с данными типа String и отправляет
// на проверку в класс Engine.
    public static void game() {
// Вывод на экран приветствия.
        String intro = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] numbers = getPrime();
        Engine.checkAnswers(numbers, intro);
    }
    private static String[][] getPrime() {
        int rounds = Engine.getRoundNumber();
        String[][] yesNo = new String[rounds][2];
        final int limitOfNumbers = 100;
        for (int i = 0; i < rounds; i++) {
            int random = Util.random(limitOfNumbers);
            String randomToString = Integer.toString(random);
            yesNo[i][0] = "Question: " + randomToString;
            boolean a = primeCheck(random);
            if (a) {
                yesNo[i][1] = "yes";
            } else {
                yesNo[i][1] = "no";
            }
        }
        return yesNo;
    }
    public static boolean primeCheck(int numb) { // определяем простое число и возвращаем результат для сравнения.
        if (numb < 2) {
            return false;
        }
        for (int i = 2; i < numb / 2; i++) {
            if (numb % i == 0) {
                return false;
            }
        }
        return true;
    }
}
