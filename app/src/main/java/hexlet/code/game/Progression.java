package hexlet.code.game;
import hexlet.code.Engine;
import hexlet.code.Util;
public class Progression {
    public static void progression() {
        String userName = Engine.introduce();
        System.out.println("What number is missing in the progression?");
        String[][] numberLine = new String[3][2];
        final int rounds = 3;
        final int limitOfRandomNumbers = 100;
        final int limitOfStepNumbers = 10;
        final int limitOfReplaceNumbers = 10;
        final int lengthOfLine = 10;
        int result;
        String line;
        int unknownNumber = 0;
        for (int i = 0; i < rounds; i++) {
            int startPoint = Util.random(limitOfRandomNumbers);
            int stepNumber = 1 + Util.random(limitOfStepNumbers);
            int replaceNumber = Util.random(limitOfReplaceNumbers);
            line = "Qestion: " + startPoint + " ";
            result = startPoint;
            for (int j = 1; j < lengthOfLine; j++) {
                result = result + stepNumber;
                if (j == replaceNumber) {
                    line = line + ".. ";
                    unknownNumber = result;
                } else {
                    line = line + result + " ";
                }
            }
            String unknownNumberToString = Integer.toString(unknownNumber);
            numberLine[i][0] = line;
            numberLine[i][1] = unknownNumberToString;
        }
        Engine.checkAnswers(numberLine, userName);
    }
}
