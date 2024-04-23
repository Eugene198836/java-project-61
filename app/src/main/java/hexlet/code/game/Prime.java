package hexlet.code.game;
import hexlet.code.Engine;

public class Prime {
    public static void primeNumber() {
// Вывод на экран приветствия.
        String name = Greet.introduce();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Engine.checkStringValues(name, "Prime");
    }
    public static boolean primeCheck(int numb) { // определяем простое число и возвращаем результат для сравнения.
        if (numb < 2) {
            return false;
        }
        for (int i = 2; i < numb / 2; i++) {
            if (numb % i == 0) {
                return false;
            }
        }
        return true;
    }
}
