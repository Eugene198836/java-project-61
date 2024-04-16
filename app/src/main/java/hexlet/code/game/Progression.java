package hexlet.code.game;
import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void progression() {

// Вывод на экран приветствия.
        String name = Greet.mayIhaveYourName();
        System.out.println("What number is missing in the progression?");

// Запуск цикла для вывода на экран "вопросов". Необходимо ответить правильно 3 раза.
// Будут сгенерированы числа для создания последовательности чисел.
        int i = 3;
        while (i > 0) {
            Random startP = new Random();
            Random stepP = new Random();
            Random replaceN = new Random();

// Создание числа начала последовательности в диапазоне [0 ; 100)
            int startPoint = startP.nextInt(100);
/*
Создание числа в диапазоне [0 ; 10), на которое будет увеличено каждое
следующее число в последовательности.
*/
            int stepPoint = 1 + stepP.nextInt(10);
/*
Генерация числа ("порядковый номер") в диапазоне [0 ; 10], по которому
в последовательности будет замещено число символом ".." .
 */
            int replaceNumber = replaceN.nextInt(10);

// Создание массива ("последовательность чисел") из 10 элементов и заполнение его значениями.
            int[] numberLine = new int[10];
            numberLine[0] = startPoint;

            for (int j = 1; j < 10; j++) {
                numberLine[j] = numberLine[j - 1] + stepPoint;
            }

// Создаем переменную, которая "запоминает" какое число в последовательности было замещено.
            int temp = numberLine[replaceNumber];

// Вывод на экран последовательности чисел, где случайным образом замещено число.
            System.out.print("Question: ");
            for (int k = 0; k < 10; k++) {
                if (numberLine[k] == numberLine[replaceNumber]) {
                    System.out.print(".. ");
                } else {
                    System.out.print(numberLine[k] + " ");
                }
            }

// Ввод в консоль ответа.
            Scanner inPut = new Scanner(System.in);
            String answer = inPut.next();
            int answerToNumber = 0;

// Перехват ошибки, если будут введены не числа, а буквы, спец.знаки и др.
            try {
                answerToNumber = Integer.parseInt(answer);
            } catch (NumberFormatException e) {
                System.out.println("Enter the number");
            }

// Сравнение введенного ответа с правильным и вывод соответствующего сообщения.
            if (answerToNumber == temp) {
                System.out.println("Your answer: " + answer);
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was " + temp);
                System.out.println("Let's try again, " + name + "!");
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
