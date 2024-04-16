package hexlet.code;
import hexlet.code.game.*;
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
        int number = 0;

// Перехват ошибки, если будут введены не числа, а буквы, спец.знаки и др.
        try {
            number = Integer.parseInt(yourDestiny);
        } catch (NumberFormatException e) {
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("Let's try again!");
        }
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
            case 6:
                Prime.primeNumber();
                break;
            case 0:
                break;
        }


    }
}
