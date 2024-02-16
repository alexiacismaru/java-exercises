package be.kdg.java1.assignments.a07_arraysv2;

public class ArraysV2App {
    public static void main(String[] args) {
        // Part 1
        StringBuilder[] suits = new StringBuilder[4];
        suits[0] = new StringBuilder("hearts");
        suits[1] = new StringBuilder("clubs");
        suits[2] = new StringBuilder("diamonds");
        suits[3] = new StringBuilder("spades");

        for (StringBuilder suit : suits) {
            System.out.println(suit);
        }
        System.out.println();

        // Part 2
        StringBuilder[] suits2 = {
                new StringBuilder("hearts"),
                new StringBuilder("clubs"),
                new StringBuilder("diamonds"),
                new StringBuilder("spades")
        };

        for (StringBuilder suit : suits2) {
            System.out.println(suit);
        }
        System.out.println();
    }  // main()
}  // class
