package Week1;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your name? ");
        System.out.print("Welcome " + keyboard.nextLine() + "!");
    }
}
