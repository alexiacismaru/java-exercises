package be.kdg.prog1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String s = scanner.next();
        StringBuilder sb = new StringBuilder(s);
        if (sb.reverse().toString().equals(s)) {
            System.out.println("\"" + s + "\" is a palindrome.");
        } else {
            System.out.println("\"" + s + "\" is not a palindrome.");
        }

    }
}
