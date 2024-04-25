package hexlet.code;
import hexlet.code.game.Greet;
import hexlet.code.game.Evengame;
import hexlet.code.game.Calculator;
import hexlet.code.game.GCD;
import hexlet.code.game.Progression;
import hexlet.code.game.Prime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

// Вывод на экран меню выбора игр.
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n" + "2 - Even\n" +  "3 - Calc\n" + "4 - GCD\n" + "5 - Progression\n"
                + "6 - Prime\n" + "0 - Exit");

//Выбор игры
        Scanner choose = new Scanner(System.in);
        String yourDestiny = choose.next();
        System.out.println("Your choice: " + yourDestiny);

        switch (yourDestiny) {
            case "1":
                Engine.introduce();
                break;
            case "2":
                Evengame.evenNum();
                break;
            case "3":
                Calculator.calculate();
                break;
            case "4":
                GCD.gcd();
                break;
            case "5":
                Progression.progression();
                break;
            case "6":
                Prime.primeNumber();
                break;
            case "0":
                System.out.println("Good bye.");
                break;
            default:
                System.out.println("Please enter the game number and press Enter.");
                System.out.println("Let's try again.");
                break;
        }


    }
}
