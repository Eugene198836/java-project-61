package hexlet.code.game;
import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
    public static void primeNumber() {
// Вывод на экран приветствия.
        String userName = Engine.introduce();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        String[][] yesNo = new String[3][2];
        final int rounds = 3;
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
        Engine.checkAnswers(yesNo, userName);

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
