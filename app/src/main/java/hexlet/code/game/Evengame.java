package hexlet.code.game;
import hexlet.code.Engine;
import hexlet.code.Util;

public class Evengame {
    // Метод создает двумерный массив - 3 строки по 2 в каждой - с данными типа String и отправляет
// на проверку в класс Engine.
    public static void game() {
        String intro = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] yesNo = getNumber();
        Engine.checkAnswers(yesNo, intro);
    }
    private static String[][] getNumber() {
        int rounds = Engine.getRoundNumber();
        String[][] evenNumber = new String[rounds][2];
        final int limitOfNumbers = 100;
        for (int i = 0; i < rounds; i++) {
            int random = Util.random(limitOfNumbers);
            String randomToString = Integer.toString(random);
            evenNumber[i][0] = "Question: " + randomToString;
            boolean a = evenCheker(random);
            if (a) {
                evenNumber[i][1] = "yes";
            } else {
                evenNumber[i][1] = "no";
            }
        }
        return evenNumber;
    }
    public static boolean evenCheker(int number) { // Проверяем число на четность.
        if (number % 2 != 0) {
            return false;
        }
        return true;
    }
}
