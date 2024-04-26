package hexlet.code.game;
import hexlet.code.Engine;
import hexlet.code.Util;
public class Calculator {
    public static void calculate() {
// Вывод на экран приветствия.
        String userName = Engine.introduce();
        System.out.println("What is the result of the expression?");
        final int numberOfQuestions = 3;
        String[][] expression = new String[numberOfQuestions][2];
        final int rounds = 3;
        final int limitOfNumbers = 100;
        final int limitOfOperators = 3;
        String[] operators = {"+", "-", "*"};
        for (int i = 0; i < rounds; i++) {
            int random1 = Util.random(limitOfNumbers);
            int random2 = Util.random(limitOfNumbers);
            int random3 = Util.random(limitOfOperators);
            String randomOperator = operators[random3];
            int result = 0;
            switch (randomOperator) {
                case "+" :
                    result = random1 + random2;
                    expression[i][0] = "Question: " + random1 + " " + randomOperator + " " + random2;
                    break;
                case "-" :
                    result = random1 - random2;
                    expression[i][0] = "Question: " + random1 + " " + randomOperator + " " + random2;
                    break;
                case "*" :
                    result = random1 * random2;
                    expression[i][0] = "Question: " + random1 + " " + randomOperator + " " + random2;
                default:
                    break;
            }
            String resultToString = Integer.toString(result);
            expression[i][0] = "Question: " + random1 + " " + randomOperator + " " + random2;
            expression[i][1] = resultToString;
        }
        Engine.checkAnswers(expression, userName);
    }
}
