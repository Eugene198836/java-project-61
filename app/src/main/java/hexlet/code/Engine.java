package hexlet.code;
import java.util.Scanner;

public class Engine {
// Метод принимает на вход два параметра - введенное имя и двумерный массив(3 строки по 2 элимента)
// с данными типа Строка. Первый элемент строки содержит вопрос, второй правильный ответ.

    public static void checkAnswers(String[][] arrayToCompare, String name) {
        final int numberOfAnswers = 2;
// Примаем переданые на вход данные и сохраняем в соответствующие переменные.
        String userName = name;
        String[][] arrayToCheck = arrayToCompare;
        int i;
        for (i = 0; i <= numberOfAnswers; i++) {
// Выводим на экран первый элемент - вопрос.
            System.out.println(arrayToCheck[i][0]);
// Вводим свой ответ.
            Scanner inPut = new Scanner(System.in);
            String answer = inPut.next();
// Идет сравнение введенного ответа с правильным ответом из второго элемента строки массива.
//Выводим соответсвующие сообщеие в случае неверного или правильного ответов.
            if (answer.equalsIgnoreCase(arrayToCheck[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was " + arrayToCheck[i][1]);
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
// При наборе 3 правильных ответов, выводится поздравительное сообщение.
            if (i == numberOfAnswers) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }

    }
    public static String introduce() {
        System.out.println("Welcome to the Brain Games");
        Scanner yourName = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = yourName.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}
