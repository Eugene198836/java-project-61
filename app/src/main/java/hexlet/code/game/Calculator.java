package hexlet.code.game;
import java.util.Scanner;
import java.util.Random;


public class Calculator{
    public static void calculate() {
        String name = Greet.mayIhaveYourName();
        System.out.println("What is the result of the expression?");
        int i = 3;
        while (i > 0) {
            Random randomOper = new Random();
            Random randomNum1 = new Random();
            Random randomNum2 = new Random();

            var randomNumber1 = randomNum1.nextInt(100);
            var randomNumber2 = randomNum2.nextInt(100);
            String[] operators = {"+", "-", "*"};
            int b = randomOper.nextInt(3);
            String randomOperator = operators[b];

            int result = 0;
            switch (randomOperator) {
                case "+" :
                    result = randomNumber1 + randomNumber2;
                    System.out.println("Question: " + randomNumber1 + " + " + randomNumber2);
                    break;
                case "-" :
                    result = randomNumber1 - randomNumber2;
                    System.out.println("Question: " + randomNumber1 + " - " + randomNumber2);
                    break;
                case "*" :
                    result = randomNumber1 * randomNumber2;
                    System.out.println("Question: " + randomNumber1 + " * " + randomNumber2);
            }
            Scanner inPut = new Scanner(System.in);
            String answer = inPut.next();
            int answerToNumber = 0;
            try {
                answerToNumber = Integer.parseInt(answer);
            } catch (NumberFormatException e) {
                System.out.println("Enter the number");
            }

            if ( result == answerToNumber) {
                System.out.println("Your answer: " + answer);
                System.out.println("Correct!");
            } else if (result != answerToNumber) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was " + result);
                System.out.println("Let's try again," + name + "!");
                break;
            }
            i--;
        }
        if (i == 0) {
            System.out.println("Congratulations," + name + "!");
        }

    }

}