package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n" + "2 - Even\n" + "0 - Exit");

        Scanner choose = new Scanner(System.in);
        String yourDestiny = choose.next();
        System.out.println("Your choice: " + yourDestiny);
        int number = Integer.parseInt(yourDestiny);
        switch (number) {
            case 1:
                System.out.println("Welcome to the Brain Games");
                Scanner yourName = new Scanner(System.in);
                System.out.print("May I have your name? ");
                String userName = yourName.next();
                System.out.println("Hello, " + userName + "!");
                yourName.close();
                break;
            case 2:
                Evengame.evenNum();
                break;
            case 0:
                System.out.println("Good bye");
                break;
        }


    }
}
