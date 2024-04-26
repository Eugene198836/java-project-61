package hexlet.code.game;
import hexlet.code.Engine;
import hexlet.code.Util;

public class Evengame {
    public static void evenNum() {
// Вывод на экран приветствия.
        String userName = Engine.introduce();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        final int numberOfQuestions = 3;
        String[][] yesNo = new String[numberOfQuestions][2];
        final int rounds = 3;
        final int limitOfNumbers = 100;
        for (int i = 0; i < rounds; i++) {
            int random = Util.random(limitOfNumbers);
            String randomToString = Integer.toString(random);
            yesNo[i][0] = "Question: " + randomToString;
            boolean a = evenCheker(random);
            if (a) {
                yesNo[i][1] = "yes";
            } else {
                yesNo[i][1] = "no";
            }
        }
        Engine.checkAnswers(yesNo, userName);

    }
    public static boolean evenCheker(int number) { // Проверяем число на четность.
        if (number % 2 != 0) {
            return false;
        }
        return true;
    }
}
