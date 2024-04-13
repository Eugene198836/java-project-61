package hexlet.code.game;
import hexlet.code.Greet;
import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static void progression() {
        String name = Greet.mayIhaveYourName();
        System.out.println("What number is missing in the progression?");
        int i = 3;
        while (i > 0) {
            Random startP = new Random();
            Random stepP = new Random();
            Random replaceN = new Random();

            int startPoint = startP.nextInt(100);
            int stepPoint = stepP.nextInt(10);
            int replaceNumber = replaceN.nextInt(11);
            int[] numberLine = new int[10];
            numberLine[0] = startPoint;

            for(int j = 1; j < 10; j++) {
                numberLine[j] = numberLine[j-1] + stepPoint;
            }

            int temp = numberLine[replaceNumber];
// if !numberline[replaceNumber]
            System.out.print("Question: ");
            for (var numbers : numberLine) {
                if (numbers == numberLine[replaceNumber]) {
                    System.out.print(".. ");
                    continue;
                }
                System.out.print(numbers + " ");
            }

            Scanner inPut = new Scanner(System.in);
            String answer = inPut.next();
            int a = Integer.parseInt(answer);

            if (a == temp) {
                System.out.println("Your answer: " + answer);
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was " + temp);
                System.out.println("Let's try again," + name + "!");
                break;
            }
            i--;
        }
        if (i == 0) {
            System.out.println("Congratulations," + name + "!");
        }
    }
}