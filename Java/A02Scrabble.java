package be.kdg.prog1;

import java.util.Scanner;

/**
 * Author: derijkej
 */
public class A02Scrabble {
	public static void main(String[] args) {
		System.out.print("Please enter a letter: ");
		Scanner keyb = new Scanner(System.in);
		String letter = keyb.nextLine();
		switch (letter) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "l":
			case "n":
			case "s":
			case "t":
			case "r":
				System.out.println("1 point");
				break;
			case "d":
			case "g":
				System.out.println("2 points");
				break;
			case "b":
			case "c":
			case "m":
			case "p":
				System.out.println("3 points");
				break;
				case "f":
			case "h":
			case "v":
			case "w":
			case "y":
				System.out.println("4 points");
				break;
				case "k":
				System.out.println("5 points");
				break;
				case "j":
			case "x":
				System.out.println("8 points");
				break;
				case "q":
			case "z":
				System.out.println("10 points");
				break;
			default:
				System.out.println("Invalid letter");
		}
	}
}
