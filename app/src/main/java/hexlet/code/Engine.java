package hexlet.code;
import java.util.Scanner;

public class Engine {
//Метод для проверки игр с ответами ДА/НЕТ.
    public static void checkAnswers(String[][] arrayToCompare, String name) {
        final int numberOfAnswers = 2;
        String userName = name;
        String[][] arrayToCheck = arrayToCompare;
        int i;
        for (i = 0; i <= numberOfAnswers; i++) {
            System.out.println(arrayToCheck[i][0]);
            Scanner inPut = new Scanner(System.in);
            String answer = inPut.next();
            if (answer.equalsIgnoreCase(arrayToCheck[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was " + arrayToCheck[i][1]);
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
            if (i == numberOfAnswers) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }

    }
    public static String introduce() {
        System.out.println("Welcome to the Brain Games");
        Scanner yourName = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = yourName.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}
