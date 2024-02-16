package be.kdg.prog1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter your first name and last name, separated by a space: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        StringBuilder builderOne = new StringBuilder();
        StringBuilder builderTwo = new StringBuilder(name);
        StringBuilder builderThree = new StringBuilder(name);
        StringBuilder builderFour = new StringBuilder();

        for (int i = 0; i < name.length(); i++) {
            if (i == 0 || name.charAt(i - 1) == ' ') {
                builderOne.append(name.charAt(i));
            }
        }

        builderTwo.reverse();

        while (builderThree.indexOf("e") != -1) {
            int positionOfE = builderThree.indexOf("e");
            builderThree.setCharAt(positionOfE, 'a');
        }

        StringBuilder sb = new StringBuilder(name);
        Random random = new Random();
        while (sb.length() > 0) {
            int index = random.nextInt(sb.length());
            builderFour.append(sb.charAt(index));
            sb.deleteCharAt(index);
        }

        System.out.println(builderOne);
        System.out.println(builderTwo);
        System.out.println(builderThree);
        System.out.println(builderFour);
    }
}
