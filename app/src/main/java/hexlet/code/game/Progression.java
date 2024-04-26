package hexlet.code.game;
import hexlet.code.Engine;
import hexlet.code.Util;
public class Progression {
    public static void game() {
        String intro = "What number is missing in the progression?";
        String[][] numberLine = getNumberLine();
        Engine.checkAnswers(numberLine, intro);
    }
    private static String[][] getNumberLine() {
        int rounds = Engine.getRoundNumber();
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
                String unknownNumberToString = Integer.toString(unknownNumber);
                numberLine[i][0] = line;
                numberLine[i][1] = unknownNumberToString;
            }
        }
        return numberLine;
    }
}
