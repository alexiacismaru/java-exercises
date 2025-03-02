package Week1;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        int choice;
        double number1, number2;
        Scanner keyboard = new Scanner(System.in);


        System.out.print("Enter a number: ");
        number1 = keyboard.nextDouble();
        System.out.print("Enter another number: ");
        number2 = keyboard.nextDouble();
        System.out.println("Choose an operation:\n" +
                "\t1 add\n" +
                "\t2 substract\n" +
                "\t3 multiply\n" +
                "\t4 divide");
        System.out.print("Your choice: ");
        choice = keyboard.nextInt();


        if(choice == 1) {
            double result = number1 + number2;
            System.out.println(number1 + " + " + number2 + " = " + result);
        }
        if(choice == 2) {
            double result = number1 - number2;
            System.out.println(number1 + " - " + number2 + " = " + result);
        }
        if(choice == 3) {
            double result = number1 * number2;
            System.out.println(number1 + " * " + number2 + " = " + result);
        }
        if(choice == 4) {
            double result = number1 / number2;
            System.out.println(number1 + " / " + number2 + " = " + result);
        }
    }
}
