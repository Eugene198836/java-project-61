package hexlet.code.game;
import hexlet.code.Engine;
import hexlet.code.Util;
public class Progression {
// Метод создает числовую последовательность со случайными числами, где одно из чисел в этой
// последовательсти будет скрыто, и создает двумерный массив - 3 строки по 2 в каждой - с этими
// данными в типе String и отправляет на проверку в класс Engine.
    public static void progression() {
// Вывод на экран приветствия.
        String userName = Engine.introduce();
        System.out.println("What number is missing in the progression?");
        final int rounds = 3;
// Создаем массив 3х2.
        String[][] numberLine = new String[rounds][2];
        final int limitOfRandomNumbers = 100;
        final int limitOfStepNumbers = 10;
        final int limitOfReplaceNumbers = 9;
        final int lengthOfLine = 9;
        int result; // случайные числа
        String line; // числовая последовательность
        int unknownNumber = 0; // скрытое число
        for (int i = 0; i < rounds; i++) {
            int startPoint = Util.random(limitOfRandomNumbers);
            int stepNumber = 1 + Util.random(limitOfStepNumbers);
            int replaceNumber = Util.random(limitOfReplaceNumbers);
// Формируем числовую последовательность. Задаем начальное число.
            result = startPoint;
            line = "Question: " + result + " ";
// Генерируем число и прибавляем его к числовой последовательности.
            for (int j = 0; j < lengthOfLine; j++) {
                result = result + stepNumber;
                if (j == replaceNumber) {
                    line = line + ".. "; // Скрытое число помечается двоеточием.
                    unknownNumber = result;
                } else {
                    line = line + result + " ";
                }

            }
// Преобразовываем скрытое число в строковый тип.
            String unknownNumberToString = Integer.toString(unknownNumber);
// В первый элемент строки массива сохраняем вопрос - числовую последовательсть.
            numberLine[i][0] = line;
// Во второй элемент строки массива сохраняем ответ - скрытое число.
            numberLine[i][1] = unknownNumberToString;
        }
        Engine.checkAnswers(numberLine, userName);
    }
}
