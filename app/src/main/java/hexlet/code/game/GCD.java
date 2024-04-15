package hexlet.code.game;

import java.util.Scanner;
import java.util.Random;
import hexlet.code.FindGCD;

public class GCD {
    public static void gcd() {
        String name = Greet.mayIhaveYourName();
        System.out.println("Find the greatest common divisor of given numbers.");
        int i = 3;
        while (i > 0) {
            Random random1 = new Random();
            Random random2 = new Random();
            int randomNumber1 = random1.nextInt(100) ;
            int randomNumber2 = random2.nextInt(100);
            System.out.println("Question " + randomNumber1 + " " + randomNumber2);

            Scanner inPut = new Scanner(System.in);
            String answer = inPut.next();
            int answerToNumber = 0;
            try {
                answerToNumber = Integer.parseInt(answer);
            } catch (NumberFormatException e) {
                System.out.println("Enter the number");
            }

            int gcdnumber = FindGCD.calculateGCD(randomNumber1,randomNumber2);

            if ( gcdnumber == answerToNumber) {
                System.out.println("Your answer: " + answer);
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was " + gcdnumber);
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