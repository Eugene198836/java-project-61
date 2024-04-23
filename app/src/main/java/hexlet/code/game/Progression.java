package hexlet.code.game;
import hexlet.code.Engine;
import hexlet.code.Util;
public class Progression {
    public static void progression() {

// Вывод на экран приветствия.
        String name = Greet.introduce();
        System.out.println("What number is missing in the progression?");
        Engine.checkIntValues(name, "Progression");
    }
    public static int arrayExpression() {
        final int limitOfRandomNumbers = 100;
        final int limitOfStepNumbers = 10;
        final int limitOfReplaceNumbers = 10;
        var startPoint = Util.random(limitOfRandomNumbers);
        var stepNumber = 1 + Util.random(limitOfStepNumbers);
        int replaceNumber = Util.random(limitOfReplaceNumbers);
        final int lengthOfArray = 10;
        int[] numberLine = new int[lengthOfArray];
        numberLine[0] = startPoint;
        for (int j = 1; j < lengthOfArray; j++) {
            numberLine[j] = numberLine[j - 1] + stepNumber;
        }
        int temp = numberLine[replaceNumber];
        System.out.print("Question: ");
        for (int i = 0; i < lengthOfArray; i++) {
            if (numberLine[i] == numberLine[replaceNumber]) {
                System.out.print(".. ");
            } else {
                System.out.print(numberLine[i] + " ");
            }
        }
        return temp;
    }

}
