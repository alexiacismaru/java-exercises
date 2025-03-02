package Week1;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int sum;
        int first;
        int second;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        first= keyboard.nextInt();
        System.out.print("Enter another number: ");
        second= keyboard.nextInt();
        sum = first + second;
        System.out.print("The sum is: " + sum);
    }
}
