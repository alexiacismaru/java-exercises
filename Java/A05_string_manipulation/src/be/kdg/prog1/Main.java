package be.kdg.prog1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter a sentence: ");
		String input = scanner.nextLine();

		System.out.println(input.toUpperCase());
		System.out.println(input.toLowerCase());
		System.out.println(input.replace('a', 'o'));
		int length = input.length();
		System.out.println(length);
		System.out.println(input.charAt(0));
		System.out.println(input.charAt(length - 1));
		int es = 0;
		for (int i = 0; i < length; i++) {
			if (input.charAt(i) == 'e') es++;
		}
		System.out.println(es);
	}
}
