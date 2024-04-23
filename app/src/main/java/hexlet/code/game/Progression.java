package hexlet.code.game;
import hexlet.code.Engine;
import hexlet.code.Util;
public class Progression {
    public static void progression() {

// Вывод на экран приветствия.
        String name = Greet.introduce();
        System.out.println("What number is missing in the progression?");
        Engine.checkIntValues(name, "Progression");
    }
    //метод для создания массива с числами, имитирующий числовую последовательность с пропущенным числом.
    public static int arrayExpression() {
        final int limitOfRandomNumbers = 100;
        final int limitOfStepNumbers = 10;
        final int limitOfReplaceNumbers = 10;
        var startPoint = Util.random(limitOfRandomNumbers); //задаем начальное число последовательсности.
        var stepNumber = 1 + Util.random(limitOfStepNumbers); // задаем шаг, на который
        // числа будут отличаться друг от друга
        int replaceNumber = Util.random(limitOfReplaceNumbers); // задаем порядковый номер
        // числа, которое будет заменено.
        final int lengthOfArray = 10;
        int[] numberLine = new int[lengthOfArray]; // создаем массив/числовую последовательность и наполняем ее числами.
        numberLine[0] = startPoint;
        for (int j = 1; j < lengthOfArray; j++) {
            numberLine[j] = numberLine[j - 1] + stepNumber;
        }
        int temp = numberLine[replaceNumber]; // порядковый номер заменяемого числа. Он будет возвращаться методом для
        //дальнейшего сравнения.
        System.out.print("Question: ");
        for (int i = 0; i < lengthOfArray; i++) { // вывод на экран готовой числовой последовательности.
            if (numberLine[i] == numberLine[replaceNumber]) {
                System.out.print(".. ");
            } else {
                System.out.print(numberLine[i] + " ");
            }
        }
        return temp;
    }

}
