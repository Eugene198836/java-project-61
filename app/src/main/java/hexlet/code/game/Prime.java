package hexlet.code.game;
import java.util.Scanner;
import java.util.Random;
import hexlet.code.Primechecker;
public class Prime {
    public static void primeNumber() {

// Вывод на экран приветствия.
        String name = Greet.mayIhaveYourName();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

// Запуск цикла для вывода на экран "вопросов". Необходимо ответить правильно 3 раза.
        int i = 3;
        while (i > 0) {

// Генерация случайного числа в диапазоне [0 ; 100)  и его вывод на экран.
            Random rand = new Random();
            int randomNumber = rand.nextInt(100);
            System.out.println("Question: " + randomNumber);
// Ввод в консоль ответа.
            Scanner inPut = new Scanner(System.in);
            String answer = inPut.next();
// Определяем, является ли ранее сгенерированное число простым.
            boolean a = Primechecker.primeCheck(randomNumber);
// Сравнение введенного ответа с правильным и вывод соответствующего сообщения.
            if (answer.equalsIgnoreCase("yes") && a == true) {
                System.out.println("Correct!");
            } else if (answer.equalsIgnoreCase("no") && a == false) {
                System.out.println("Correct!");
            } else if (!answer.equalsIgnoreCase("yes") && a == true) {
                System.out.println("'" + answer + "' is wrong answer ;(. " +
                        "Correct answer was 'yes' ! ");
                System.out.println("Let's try again, " + name + "!");
                break;
            } else if (!answer.equalsIgnoreCase("yes") && a == false) {
                System.out.println("'" + answer + "' is wrong answer ;(. " +
                        "Correct answer was 'no' ! ");
                System.out.println("Let's try again, " + name + "!");
                break;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. " +
                        "Correct answer was 'no' ! ");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
            i--;
        }
        if (i == 0) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
