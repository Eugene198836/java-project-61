package hexlet.code.game;
import java.util.Scanner;

public class Greet {
    private String userName;
    public static String introduce() {
        System.out.println("Welcome to the Brain Games");
        Scanner yourName = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = yourName.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}
