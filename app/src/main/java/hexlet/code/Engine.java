package hexlet.code;
import hexlet.code.Util;
import hexlet.code.game.*;

import java.util.Scanner;

public class Engine {

    public static void checkStringValues(String name, String methodName) {
        final int numberOfAnswers = 3;
        String userName = name;
        int i;
        final int limitOfRandomNumbers = 100;
        for (i = 1; i <= numberOfAnswers; i++) {
            boolean logResult = false;
            String answer;
            int result = 0;
            var random = Util.random(100);
            System.out.println("Question: " + random);
            if (methodName.equalsIgnoreCase("Even")) {
                logResult = Evengame.evenCheker(random);
            } else if (methodName.equalsIgnoreCase("Prime")){
                logResult = Prime.primeCheck(random);
            }
            answer = readPhrase(userName);
            compareStringValues(answer, userName, logResult);
            if (i == numberOfAnswers) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }

    }

    public static void checkIntValues(String name, String methodName) {
        String answer;
        String userName = name;
        final int numberOfAnswers = 3;
        int result;
        int answerToNumber;
        int i;
        for (i = 1; i <= numberOfAnswers; i++) {
            if (methodName.equalsIgnoreCase("Calc")) {
                result = Calculator.randomExpression();
            } else if (methodName.equalsIgnoreCase("GCD")) {
                result = GCD.createGCD();
            } else if (methodName.equalsIgnoreCase("Progression")) {
                result = Progression.arrayExpression();
            } else break;

            Scanner inPut = new Scanner(System.in);
            answer = inPut.next();
            answerToNumber = 0;
            try {
                answerToNumber = Integer.parseInt(answer);
            } catch (NumberFormatException e) {
                System.out.println("Enter the number");

            }
            compareIntValues(answerToNumber, result, answer, userName);
            if (i == numberOfAnswers) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }

    public static String readString() {
        Scanner inPut = new Scanner(System.in);
        String answer = inPut.next();
        return answer;
    }

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

    public static int readInt() {
// Ввод в консоль своего ответа
        Scanner inPut = new Scanner(System.in);
        String answer = inPut.next();
        int answerToNumber = 0;


        try {
            answerToNumber = Integer.parseInt(answer);
        } catch (NumberFormatException e) {
            System.out.println("Enter the number");

        }
        return answerToNumber;
    }
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