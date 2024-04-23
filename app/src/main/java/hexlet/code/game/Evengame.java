package hexlet.code.game;
import hexlet.code.Engine;
public class Evengame {
    public static void evenNum() {
// Вывод на экран приветствия.
        String name = Greet.introduce();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Engine.checkStringValues(name, "Even");
    }
    public static boolean evenCheker(int number) {
        if (number % 2 != 0) {
            return false;
        }
        return true;
    }
}
