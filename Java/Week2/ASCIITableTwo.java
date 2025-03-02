package Week2;

import java.util.Scanner;

public class ASCIITableTwo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        final int MIN = 100000;
        final int MAX = 999999;
        int a;
        long product;
        int b;

        System.out.println("Insert a 6 digit number");
        a = keyboard.nextInt();
        System.out.println("Insert another 6 digit number");
        b = keyboard.nextInt();

        if (a >= MIN && a <= MAX && b >= MIN && b <= MAX) {
            product = ((long) a * b);
            System.out.print("The product is" + product);
            System.out.print("The last 5 digits are" + (product % 100000));
        } else {
            System.out.print("Not a 6 digit number.");
        }
    }
}
