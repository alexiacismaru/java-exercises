package Week1;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int first = keyboard.nextInt();
        System.out.print("Enter another number: ");
        int second = keyboard.nextInt();
        System.out.print("Enter a final number: ");
        int third = keyboard.nextInt();
        int product = first * second * third;
        System.out.println("The product is " + product);
    }
}
