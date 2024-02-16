package be.kdg.java1.assignments.a03_foreach;

public class ForEachApp {
    public static void main(String[] args) {
        // Part 1: replacing for-loops
        int[] lotteryNumbers = {3, 6, 17, 31, 32, 43};

        for (int lotteryNumber : lotteryNumbers) {
            System.out.print(lotteryNumber + " ");
        }

        lotteryNumbers[1] = 13;

        System.out.println();
        for (int lotteryNumber : lotteryNumbers) {
            System.out.print(lotteryNumber + " ");
        }
        System.out.println();

        // Part 2
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (i + 1) * 7;
        }

        // Part 3
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Part 4
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }  // main()
}  // class
