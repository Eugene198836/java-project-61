package hexlet.code.game;
import hexlet.code.Engine;
import hexlet.code.Util;
public class Calculator {
    // Метод создает арифметическое выражение со случайными арифметическими операторами, случайными
    // числами, вычисляет его результат и
    // создает двумерный массив - 3 строки по 2 в каждой - с этими данными в типе String и отправляет
// на проверку в класс Engine.
    public static void calculate() {
// Вывод на экран приветствия.
        String userName = Engine.introduce();
        System.out.println("What is the result of the expression?");
        final int rounds = 3;
// Создаем массив 3х2.
        String[][] expression = new String[rounds][2];
        final int limitOfNumbers = 100;
        final int limitOfOperators = 3;
// Создаем массив с арифметическими операторами.
        String[] operators = {"+", "-", "*"};
        for (int i = 0; i < rounds; i++) {
// Генерируем выражение со случайнми числами и случайно выбранными операторами.
// Также вычисялем результат операции
            int random1 = Util.random(limitOfNumbers);
            int random2 = Util.random(limitOfNumbers);
            int random3 = Util.random(limitOfOperators);
            String randomOperator = operators[random3];
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
                    expression[i][0] = "Question: " + random1 + " * "+ random2;
                default:
                    break;
            }
// Результат операции преобразовываем в тип String.
            String resultToString = Integer.toString(result);
// В первый элемент строки массива сохраняем вопрос - арифметическое выражение.
            expression[i][0] = "Question: " + random1 + " " + randomOperator + " " + random2;
// Во втрой элемент строки массива сохраняем правильный ответ - результат вычисления.
            expression[i][1] = resultToString;
        }
// Отправляем массив в класс Engine.
        Engine.checkAnswers(expression, userName);
    }
}
