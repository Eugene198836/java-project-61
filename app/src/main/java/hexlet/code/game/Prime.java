package hexlet.code.game;

import java.util.Scanner;
import java.util.Random;
import hexlet.code.Primechecker;

public class Prime {
    public static void primeNumber() {
        String name = Greet.mayIhaveYourName();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int i = 3;
        while (i > 0) {
            Random rand = new Random();
            int randomNumber = rand.nextInt(100);
            System.out.println("Question " + randomNumber);
            Scanner inPut = new Scanner(System.in);
            String answer = inPut.next();
            boolean a = Primechecker.primeCheck(randomNumber);

            if ((answer.equalsIgnoreCase("yes") && a == true)
            || (answer.equalsIgnoreCase("no") && a == false)) {
                System.out.println("Correct!");
                // как правильно читать след.метод с оператором '!' ?
            }  else if (!answer.equalsIgnoreCase("yes") && a == true) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'yes' ! ");
                break;
            } else if (!answer.equalsIgnoreCase("yes") && a == false) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'no' ! ");
                break;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'no' ! ");
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