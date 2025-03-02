package Week3;

import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Which number would you like to see the multiples of");
        for (int number = keyboard.nextInt();number <= 100; number++) {
            if (number % 28 == 0) {
                System.out.print(number + " ");
            }
        }
    }
}
