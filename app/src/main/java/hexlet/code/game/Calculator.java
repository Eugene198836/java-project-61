package hexlet.code.game;
import java.util.Scanner;
import java.util.Random;
public class Calculator {
    public static void calculate() {

// Вывод на экран приветствия.
        String name = Greet.mayIhaveYourName();
        System.out.println("What is the result of the expression?");

// Запуск цикла для вывода на экран "вопросов". Необходимо ответить правильно 3 раза.
// Будут сгенерированы случайные числа и оператор вычислений.
        final int numberOfQuestios = 2;
        for (int i = 0; i <= numberOfQuestios; i++) {

// Генерция 2 случайных чисел в диапазоне [0 ; 100).
            Random randomOper = new Random();
            Random randomNum1 = new Random();
            Random randomNum2 = new Random();
            final int limitOfRandomNumbers = 100;
            var randomNumber1 = randomNum1.nextInt(limitOfRandomNumbers);
            var randomNumber2 = randomNum2.nextInt(limitOfRandomNumbers);

// Создание массива, где хранятся операторы арифметические операций.
            String[] operators = {"+", "-", "*"};

// Генерация случайного числа, по которому операторы будут выбираться из массива.
            int b = randomOper.nextInt(3);
            String randomOperator = operators[b];

// Выбор операций по сгенерированным ранее числам в зависимости от выбранного оператора.
            int result = 0;
            switch (randomOperator) {
                case "+" :
                    result = randomNumber1 + randomNumber2;
                    System.out.println("Question: " + randomNumber1 + " + " + randomNumber2);
                    break;
                case "-" :
                    result = randomNumber1 - randomNumber2;
                    System.out.println("Question: " + randomNumber1 + " - " + randomNumber2);
                    break;
                case "*" :
                    result = randomNumber1 * randomNumber2;
                    System.out.println("Question: " + randomNumber1 + " * " + randomNumber2);
                default:
                    break;
            }

// Ввод в консоль своего ответа
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
            if (result == answerToNumber) {
                System.out.println("Your answer: " + answer);
                System.out.println("Correct!");
            } else if (result != answerToNumber) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was " + result);
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
