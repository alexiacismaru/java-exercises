package be.kdg.java1.assignments.a06_countingletters;

import java.util.Scanner;

public class CountingLettersApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String sentence = scanner.nextLine();
        sentence = sentence.toLowerCase();

        int[] frequencies = new int[26];
        int totalLetters = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char currentCharacter = sentence.charAt(i);
            // character 'a' has a decimal representation of
            // 97 in the ASCII table.
            int characterIndex = currentCharacter - 97;
            if (characterIndex >= 0 && characterIndex < 26) {
                frequencies[characterIndex]++;
                totalLetters++;
            }
        }

        System.out.println("Letter frequencies:");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.printf("%c --> %d times  ", i + 97, frequencies[i]);
            if ((i + 1) % 4 == 0) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("Total amount of letters: " + totalLetters);
    }  // main()
}  // class
