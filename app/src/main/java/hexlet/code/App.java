package hexlet.code;
import hexlet.code.game.GCD;
import hexlet.code.game.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n" + "2 - Even\n" +  "3 - Calc\n" + "4 - GCD\n" + "5 - Progression\n" + "0 - Exit");



        Scanner choose = new Scanner(System.in);
        String yourDestiny = choose.next();
        System.out.println("Your choice: " + yourDestiny);
        int number = Integer.parseInt(yourDestiny);
        switch (number) {
            case 1:
                Greet.mayIhaveYourName();
                break;
            case 2:
                Evengame.evenNum();
                break;
            case 3:
                Calculator.calculate();
                break;
            case 4:
                GCD.gcd();
                break;
            case 5:
                Progression.progression();
                break;
            case 0:
                System.out.println("Good bye");
                break;
        }


    }
}
