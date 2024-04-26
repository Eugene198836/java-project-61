package hexlet.code.game;
import hexlet.code.Engine;
import hexlet.code.Util;

public class GCD {
    // Метод вычисляет наибольший общий делитель (НОД) и
    // создает двумерный массив - 3 строки по 2 в каждой - с данными типа String и отправляет
// на проверку в класс Engine.
    public static void gcd() {
// Вывод на экран приветствия.
        String userName = Engine.introduce();
        System.out.println("Find the greatest common divisor of given numbers.");
// Создаем массив 3х2.
        final int rounds = 3;
        String[][] numbers = new String[rounds][2];
        final int limitOfNumbers = 100;
        for (int i = 0; i < rounds; i++) {
// Заполням массив.
            int random1 = Util.random(limitOfNumbers);
            int random2 = Util.random(limitOfNumbers);
// Находим НОД и сохраняем его в переменной типа String.
            int gcdNumber = calculateGCD(random1, random2);
            String gcdNumberToString = Integer.toString(gcdNumber);
// // В первый элемент строки массива сохраняем вопрос - два ранее созданных рандомных числаю
            numbers[i][0] = "Question: " + random1 + " " + random2;
// Во второй элемент строки массива сохраняем ответ - НОД в строковом варианте.
            numbers[i][1] = gcdNumberToString;
        }
        Engine.checkAnswers(numbers, userName);
    }
    public static int calculateGCD(int a, int b) { // Вычисляем наибольший общий делитель
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
