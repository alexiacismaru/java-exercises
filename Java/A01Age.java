package be.kdg.prog1;

import java.util.Scanner;

public class A01Age {
    public static void main(String[] args) {
        System.out.print("Please enter your age: ");
	    Scanner keyb = new Scanner(System.in);
	    int age = keyb.nextInt();
	    if (age < 2) {
		    System.out.println("Hey Baby!");
	    } else if (age < 13 ) {
		    System.out.println("Chill child!");
	    } else if (age < 18 ){
		    System.out.println("Top Teenager!");
	    } else {
		    System.out.println("Act like an adult!");
	    }
    }
}
