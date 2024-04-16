package hexlet.code.game;

import java.util.Scanner;
import java.util.Random;
import hexlet.code.FindGCD;

public class GCD {
    public static void gcd() {

// Вывод на экран приветствия.
        String name = Greet.mayIhaveYourName();
        System.out.println("Find the greatest common divisor of given numbers.");

// Запуск цикла для вывода на экран "вопросов". Необходимо ответить правильно 3 раза.
// // Будут сгенерированы случайные числа и найден и наибольший общий делитель.
        int i = 3;
        while (i > 0) {

// Генерция 2 случайных чисел в диапазоне [0 ; 100) и их вывод на экран.
            Random random1 = new Random();
            Random random2 = new Random();
            int randomNumber1 = random1.nextInt(100) ;
            int randomNumber2 = random2.nextInt(100);
            System.out.println("Question: " + randomNumber1 + " " + randomNumber2);

// Ввод в консоль своего ответа.
            Scanner inPut = new Scanner(System.in);
            String answer = inPut.next();
            int answerToNumber = 0;

// Перехват ошибки, если будут введены не числа, а буквы, спец.знаки и др.
            try {
                answerToNumber = Integer.parseInt(answer);
            } catch (NumberFormatException e) {
                System.out.println("Enter the number");
            }

// Вычисление наибольшего общего делителя ранее сгенерированных чисел.
            int gcdnumber = FindGCD.calculateGCD(randomNumber1,randomNumber2);

// Сравнение введенного ответа с правильным и вывод соответствующего сообщения.
            if ( gcdnumber == answerToNumber) {
                System.out.println("Your answer: " + answer);
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was " + gcdnumber);
                System.out.println("Let's try again," + name + "!");
                break;
            }
            i--;
        }

// Вывод на экран поздравления, если даны 3 правильных ответа.
        if (i == 0) {
            System.out.println("Congratulations, " + name + "!");
        }

    }

}