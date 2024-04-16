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
        final int numberOfQuestios = 2;
        for (int i = 0; i <= numberOfQuestios; i++) {

// Генерация случайного числа в диапазоне [0 ; 100)  и его вывод на экран.
            Random rand = new Random();
            final int limitOfRandomNumbers = 100;
            int randomNumber = rand.nextInt(limitOfRandomNumbers);
            System.out.println("Question: " + randomNumber);
// Ввод в консоль ответа.
            Scanner inPut = new Scanner(System.in);
            String answer = inPut.next();
// Определяем, является ли ранее сгенерированное число простым.
            boolean a = Primechecker.primeCheck(randomNumber);
// Сравнение введенного ответа с правильным и вывод соответствующего сообщения.
            if (answer.equalsIgnoreCase("yes")) {
                if (a) {
                    System.out.println("Correct!");
                } else if (!a) {
                    System.out.println("'" + answer + "' is wrong answer ;(. "
                            + "Correct answer was 'no' ! ");
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
            }
            if (answer.equalsIgnoreCase("no")) {
                if (!a) {
                    System.out.println("Correct!");
                } else if (a) {
                    System.out.println("'" + answer + "' is wrong answer ;(. "
                            + "Correct answer was 'yes' ! ");
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }

            }
            if (!answer.equalsIgnoreCase("yes") & !answer.equalsIgnoreCase("no")) {
                System.out.println("\"Enter \"yes\" or \"no\".");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
// Вывод на экран поздравления, если даны 3 правильных ответа.
            if (i == numberOfQuestios) {
                System.out.println("Congratulations, " + name + "!");
            }
        }
    }
}
