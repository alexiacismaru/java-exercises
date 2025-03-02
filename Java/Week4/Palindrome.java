package Week4;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = keyboard.next();
        StringBuilder x = new StringBuilder(word);
        if (x.reverse().toString().equals(word)) {
            System.out.println("\"" + word + "\" is a palindrome.");
        } else {
            System.out.println("\"" + word + "\" is not a palindrome.");
        }
    }
}
