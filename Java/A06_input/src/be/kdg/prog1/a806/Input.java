package be.kdg.prog1.a806;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputValid = false;
        double number = 0.0;
        do {
            System.out.print("Please enter a decimal number between 0 and 10: ");
            try {
                number = scanner.nextDouble();
                if (number > 0.0 && number < 10.0) {
                    inputValid = true;
                } else {
                    System.out.println("That number is not between 0 and 10!");
                }
            } catch (InputMismatchException e) {
                System.out.println("That's not a decimal number!");
                scanner.nextLine();
            }
        } while (!inputValid);

        System.out.println("Thanks, " + number + " is a valid number!");
    }
}
