package hexlet.code.game;
import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
// Метод создает двумерный массив - 3 строки по 2 в каждой - с данными типа String и отправляет
// на проверку в класс Engine.
    public static void primeNumber() {
// Вывод на экран приветствия.
        String userName = Engine.introduce();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        final int rounds = 3;
// Создаем массив 3х2.
        String[][] yesNo = new String[rounds][2];
        final int limitOfNumbers = 100;
        for (int i = 0; i < rounds; i++) {
// Заполням массив.
            int random = Util.random(limitOfNumbers);
            String randomToString = Integer.toString(random);
// В первый элемент строки массива сохраняем вопрос.
            yesNo[i][0] = "Question: " + randomToString;
// Во второй элемент строки массива сохраняем ответ.
            boolean a = primeCheck(random);
            if (a) {
                yesNo[i][1] = "yes";
            } else {
                yesNo[i][1] = "no";
            }
        }
// Отправляем в класс Engine введенное имя и массив.
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
