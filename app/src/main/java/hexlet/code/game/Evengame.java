package hexlet.code.game;

import java.util.Scanner;
import java.util.Random;

public class Evengame{
    public static void evenNum(){
        String name = Greet.mayIhaveYourName();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int i = 3;
        while (i > 0) {
            Random rand = new Random();
            int randomNumber = rand.nextInt(100);
            System.out.println("Question " + randomNumber);
            Scanner inPut = new Scanner(System.in);
            String answer = inPut.next();
            if ((answer.equalsIgnoreCase("yes") && randomNumber % 2 ==0) ||
                    (answer.equalsIgnoreCase("no") && randomNumber % 2 !=0)) {
                System.out.println("Correct!");

            } else if (!answer.equalsIgnoreCase("yes") && randomNumber % 2 !=0) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again," + name + "!");
                break;
            } else if (!answer.equalsIgnoreCase("no") && randomNumber % 2 ==0) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'yes'.");
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
