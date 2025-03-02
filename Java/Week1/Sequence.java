package Week1;

import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many numbers do you want to print? ");
        int number = keyboard.nextInt();
        System.out.print("What is the starting value? ");
        int base = keyboard.nextInt();
        System.out.print("What is the increment? ");
        int increment = keyboard.nextInt();


        int counter = 0;
        while(counter < number) {
            System.out.print(base + " ");
            base = base + increment;
            counter++;
        }
    }
}
