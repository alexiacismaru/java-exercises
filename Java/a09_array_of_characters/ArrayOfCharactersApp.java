package be.kdg.java1.assignments.a09_array_of_characters;

public class ArrayOfCharactersApp {
    public static void main(String[] args) {
        String word = "JavaScript";

        char[] letters = word.toCharArray();

        for (char letter : letters) {
            System.out.print(letter + " ");
        }
    }  // main()
}  // class
