package hexlet.code.game;
import hexlet.code.Greet;

import java.util.Scanner;
import java.util.Random;

public class GCD {


    public static void gcd() {
        String name = Greet.mayIhaveYourName();
        System.out.println("Find the greatest common divisor of given numbers.");
        int i = 3;
        while (i > 0) {
            Random random1 = new Random();
            Random random2 = new Random();

            int randomNumber1 = random1.nextInt(10) ;
            int randomNumber2 = random2.nextInt(20);

            while (randomNumber2 != 0) {
                int tmp = randomNumber1 % randomNumber2;
                randomNumber1 = randomNumber2;
                randomNumber2 = tmp;
            }
            int gcdnumber = randomNumber1;

            System.out.println("Question " + randomNumber1 + " " + randomNumber2);

            Scanner inPut = new Scanner(System.in);
            String answer = inPut.next();
            int a = Integer.parseInt(answer);

            if ( gcdnumber == a) {
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