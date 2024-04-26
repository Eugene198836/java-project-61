package hexlet.code;
import java.util.Scanner;

public class Engine {
    final static int ROUND_NUMBER = 3;
// Метод принимает на вход два параметра - введенное имя и двумерный массив(3 строки по 2 элимента)
// с данными типа Строка. Первый элемент строки содержит вопрос, второй правильный ответ.

    public static void checkAnswers(String[][] arrayToCompare, String intro) {

// Примаем переданые на вход данные и сохраняем в соответствующие переменные.
        String userName  = introduce();
        System.out.println(intro);
        String[][] arrayToCheck = arrayToCompare;
        int i;
        for (i = 0; i < ROUND_NUMBER; i++) {
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
            if (i == ROUND_NUMBER - 1) {
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
    public static int getRoundNumber () {
       return ROUND_NUMBER;
    }
}
