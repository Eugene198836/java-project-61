package hexlet.code.game;
import hexlet.code.Engine;
import hexlet.code.Util;

import java.util.Scanner;
import java.util.Random;
public class Calculator {
    public static void calculate() {
// Вывод на экран приветствия.
        String name = Greet.introduce();
        System.out.println("What is the result of the expression?");
        Engine.checkIntValues(name, "Calc");
    }
    public static int randomExpression() {
        final int limitOfNumbers = 100;
        final int limitOfOperators = 3;
        var randomNumber1 = Util.random(limitOfNumbers);
        var randomnumber2 = Util.random(limitOfNumbers);
        var randomnumber3 = Util.random(limitOfOperators);
        String[] operators = {"+", "-", "*"};
        String randomOperator = operators[randomnumber3];
        var result = create(randomOperator,randomNumber1,randomnumber2);
        return result;
    }

    private static int create(String randomOperator, int randomNumber1, int randomNumber2) {
        if (randomOperator.equals("+")) {
            System.out.println("Question: " + randomNumber1 + " + " + randomNumber2);
            return randomNumber1 + randomNumber2;
        } else if (randomOperator.equals("-")) {
            System.out.println("Question: " + randomNumber1 + " - " + randomNumber2);
            return randomNumber1 - randomNumber2;
        } else if (randomOperator.equals("*")) {
            System.out.println("Question: " + randomNumber1 + " * " + randomNumber2);
            return randomNumber1 * randomNumber2;
        } else return 0;
    }

}
