package Week1;

import java.util.Scanner;

public class HigherLower {
    public static void main(String[] args) {
        int guess;
        int secret = 56;
        int counter = 0;
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number: ");
            guess = keyboard.nextInt();
            counter = counter + 1;
            if (guess == secret) {
                System.out.print(
                        "Congratulations, you used " + counter + " guesses to find the right number!");
                return;
            }
            if (guess < secret) {
                System.out.print("Higher! ");
            }
            if (guess > secret) {
                System.out.print("Lower! ");
            }
        }
    }
}
