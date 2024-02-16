package be.kdg.prog1.a807;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a value for 'a': ");
        int a = scanner.nextInt();
        System.out.print("Please enter a value for 'b': ");
        int b = scanner.nextInt();

        try {
            int c = a / b;
            System.out.println("a / b = " + c);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero!");
        }
    }
}
