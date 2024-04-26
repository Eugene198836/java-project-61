package hexlet.code.game;
import hexlet.code.Engine;
import hexlet.code.Util;

public class Evengame {
    // Метод создает двумерный массив - 3 строки по 2 в каждой - с данными типа String и отправляет
// на проверку в класс Engine.
    public static void evenNum() {
// Вывод на экран приветствия.
        String userName = Engine.introduce();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
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
            boolean a = evenCheker(random);
            if (a) {
                yesNo[i][1] = "yes";
            } else {
                yesNo[i][1] = "no";
            }
        }
        Engine.checkAnswers(yesNo, userName);

    }
    public static boolean evenCheker(int number) { // Проверяем число на четность.
        if (number % 2 != 0) {
            return false;
        }
        return true;
    }
}
