package Week1;

import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int sum = 0;
        int number;

        while(true) {
            System.out.print("Enter a number (to stop enter 0): ");
            number = keyboard.nextInt();
            sum = sum + number;
            if(number == 0) {
                System.out.println("The sum of these numbers is: " + sum);
                return;
            }
        }
    }
}
