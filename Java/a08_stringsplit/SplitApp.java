package be.kdg.java1.assignments.a08_stringsplit;

public class SplitApp {
    public static void main(String[] args) {
        String text = "Java can be tricky at times";
        String[] words = text.split(" ");
        
        for (String word : words) {
            System.out.printf(" \"%s\"", word);
        }
    }  // main()
}  // class
