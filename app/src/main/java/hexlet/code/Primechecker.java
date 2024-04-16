package hexlet.code;
public class Primechecker {
    public static boolean primeCheck(int numb) {
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
