package hexlet.code.game;
import hexlet.code.Engine;
import hexlet.code.Util;
public class Calculator {
    // Метод создает арифметическое выражение со случайными арифметическими операторами, случайными
    // числами, вычисляет его результат и
    // создает двумерный массив - 3 строки по 2 в каждой - с этими данными в типе String и отправляет
// на проверку в класс Engine.
    public static void game() {
        String intro = "What is the result of the expression?";
        String[][] expression = getExpression();
        Engine.checkAnswers(expression, intro);
    }
    private static String getRandomOperator() {
        final int limitOfOperators = 3;
        String[] operators = {"+", "-", "*"};
        int random3 = Util.random(limitOfOperators);
        String randomOperator = operators[random3];
        return randomOperator;
    }
    private static String[][] getExpression() {
        final int limitOfNumbers = 100;
        int rounds = Engine.getRoundNumber();
        String[][] expression = new String[rounds][2];
        for (int i = 0; i < rounds; i++) {
            int random1 = Util.random(limitOfNumbers);
            int random2 = Util.random(limitOfNumbers);
            String randomOperator = getRandomOperator();
            int result = 0;
            switch (randomOperator) {
                case "+" :
                    result = random1 + random2;
                    expression[i][0] = "Question: " + random1 + " + " + random2;
                    break;
                case "-" :
                    result = random1 - random2;
                    expression[i][0] = "Question: " + random1 + " - " + random2;
                    break;
                case "*" :
                    result = random1 * random2;
                    expression[i][0] = "Question: " + random1 + " * " + random2;
                default:
                    break;
            }
            String resultToString = Integer.toString(result);
            expression[i][0] = "Question: " + random1 + " " + randomOperator + " " + random2;
            expression[i][1] = resultToString;
        }
        return expression;
    }
}
