package be.kdg.prog1;

import java.util.Scanner;

public class A08Divisible {
	public static void main(String[] args) {
		final int MAX = 1000;
		Scanner scanner = new Scanner(System.in);

		System.out.println("We'll print all numbers below 1000 that are divisible between 2 numbers of your choosing.");

		boolean stop = false;
		do {
			System.out.print("\nEnter the first divider (end the program with 0): ");
			int first = scanner.nextInt();
			if (first > 0) {
				System.out.print("Enter the second divider: ");
				int second = scanner.nextInt();
				if (second > 0) {
					int count = 0;
					for (int getal = 1; getal < MAX; getal++) {
						if (getal % first == 0 && getal % second == 0) {
							System.out.print(getal + " ");
							if (++count % 10 == 0) {
								System.out.println();
								count = 0;
							}
						}
					}
					System.out.println();
				} else {
					if (second < 0) {
						System.out.println("Please enter positive numbers");
					} else {
						stop = true;
					}
				}
			} else {
				if (first < 0) {
					System.out.println("Please enter positive numbers");
				} else {
					stop = true;
				}			}
		} while (!stop);
	}
}