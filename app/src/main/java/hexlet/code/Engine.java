package hexlet.code;
import hexlet.code.game.Calculator;
import hexlet.code.game.Evengame;
import hexlet.code.game.GCD;
import hexlet.code.game.Prime;
import hexlet.code.game.Progression;
import java.util.Scanner;

public class Engine {
//Метод для проверки игр с ответами ДА/НЕТ.
    public static void checkStringValues(String name, String methodName) {
        final int numberOfAnswers = 3;
        String userName = name;
        int i;
        final int limitOfRandomNumbers = 100;
        for (i = 1; i <= numberOfAnswers; i++) {
            boolean logResult = false;
            String answer;
            int result = 0;
            var random = Util.random(limitOfRandomNumbers);
            System.out.println("Question: " + random); // Вывод на экран вопроса.
            //В зависимости от переданного в метод параметра, будет вычисляться результат - правильный ответ - с которым
//будет сравниваться введенный ответ.
            if (methodName.equalsIgnoreCase("Even")) {
                logResult = Evengame.evenCheker(random);
            } else if (methodName.equalsIgnoreCase("Prime")) {
                logResult = Prime.primeCheck(random);
            }
//Ввод своего ответа.
            answer = readPhrase(userName);
            compareStringValues(answer, userName, logResult); // Сравнение введенного ответа с правильным.
            if (i == numberOfAnswers) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }

    }
//Метод для проверки игр, где проводятся числовые операции.
    public static void checkIntValues(String name, String methodName) {
        String answer;
        String userName = name;
        final int numberOfAnswers = 3;
        int result;
        int answerToNumber;
        int i;
        for (i = 1; i <= numberOfAnswers; i++) {
//В зависимости от переданного в метод параметра, будет вычисляться результат - правильный ответ - с которым
//будет сравниваться введенный ответ.
            if (methodName.equalsIgnoreCase("Calc")) {
                result = Calculator.randomExpression();
            } else if (methodName.equalsIgnoreCase("GCD")) {
                result = GCD.createGCD();
            } else if (methodName.equalsIgnoreCase("Progression")) {
                result = Progression.arrayExpression();
            } else {
                break;
            }
            // Ввод своего ответа.
            Scanner inPut = new Scanner(System.in);
            answer = inPut.next();
            answerToNumber = 0;
            // Вывод сообщения, если введены не числа, а буквы и другие символы.
            try {
                answerToNumber = Integer.parseInt(answer);
            } catch (NumberFormatException e) {
                System.out.println("Enter the number");
            }
            compareIntValues(answerToNumber, result, answer, userName); // Сравнение введенного ответа с правильным.
            if (i == numberOfAnswers) {
                System.out.println("Congratulations, " + userName + "!"); // Сообщение-поздравление, если
                // даны 3 правильнрых ответа.
            }
        }
    }

//Метод для получения данных, типа "Строка", которые нужны для сравнения с правильным ответом. Также проверяет,
    //чтобы были введены только ответы - ДА/Нет. В параметре метода используется "имя игрока", чтобы, в случае
    //неправильного ответа, отобразилось сообещение с этим именем.
    public static String readPhrase(String userName) {
        Scanner inPut = new Scanner(System.in);
        String answer = inPut.next();
        if (!answer.equalsIgnoreCase("yes") & !answer.equalsIgnoreCase("no")) {
            System.out.println("\"Enter \"yes\" or \"no\".");
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'no'.");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }
        return answer;
    }

    // Метод используется для сравнения введенных ответов с правильными в вопросам, где проводятся операции над числами.
    // У метода 4 параметра - введенный ответ, правильный ответ, переменная со строковыми данными для сообщения
    //в случае неверного ответа, и переменная с именем.
    public static void compareIntValues(int answerToNumber, int result, String answer, String userName) {
        if (result == answerToNumber) {
            System.out.println("Your answer: " + answer);
            System.out.println("Correct!");
        } else if (result != answerToNumber) {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was " + result);
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }
    }
    // Метод используется для сравнения введенных ответов с правильными в вопросам, типа ДА/НЕТ.
    //У метода 3 параметра - введенный ответ, введенное имя и "флажок". Флажок показывает, является ли число
    //четным, простым и т.д.
    public static void compareStringValues(String answer, String userName, boolean logResult) {
        if (answer.equalsIgnoreCase("yes")) {
            if (logResult) {
                System.out.println("Correct!");
            } else if (!logResult) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + userName + "!");
                System.exit(0);
            }
        } else if (answer.equalsIgnoreCase("no")) {
            if (!logResult) {
                System.out.println("Correct!");
            } else  if (logResult) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + userName + "!");
                System.exit(0);
            }
        }

    }
}
