package hexlet.code.game;

import java.util.Scanner;
import java.util.Random;

public class Evengame{
    public static void evenNum(){

// Вывод на экран приветствия.
        String name = Greet.mayIhaveYourName();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

// Запуск цикла для вывода на экран "вопросов". Необходимо ответить правильно 3 раза.
        int i = 3;
        while (i > 0) {

// Генерация случайного числа в пределах  [0 ; 100) и его вывод на экран.
            Random rand = new Random();
            int randomNumber = rand.nextInt(100);
            System.out.println("Question " + randomNumber);

// Ввод в консоль своего ответа.
            Scanner inPut = new Scanner(System.in);
            String answer = inPut.next();

// Сравнение введенного слова с правильным вариантом ответа и его вывод на экран.
// Вывод на экран сообщения, если даны правильные ответы.
            if ((answer.equalsIgnoreCase("yes") && randomNumber % 2 ==0) ||
                    (answer.equalsIgnoreCase("no") && randomNumber % 2 !=0)) {
                System.out.println("Correct!");

// Вывод на экран сообщения, если даны неправильные ответы.
            } else if (!answer.equalsIgnoreCase("yes") && randomNumber % 2 !=0) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again," + name + "!");
                break;
            } else if (!answer.equalsIgnoreCase("no") && randomNumber % 2 ==0) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again," + name + "!");
                break;
            }
                i--;
        }

// Вывод на экран поздравления, если даны 3 правильных ответа.
        if (i == 0) {
            System.out.println("Congratulations," + name + "!");
        }
    }




}
