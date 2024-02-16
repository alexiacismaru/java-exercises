package be.kdg.prog1;

import java.util.Scanner;

public class A09Interest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double startingCapital;
		double interest;
		int years;
		double capital = 0;

		// task 1: capital factor
		System.out.print("Enter the starting capital in €: ");
		startingCapital = scanner.nextDouble();
		System.out.print("Enter the interest rate: ");
		interest = 1+ (scanner.nextDouble()/100);

		System.out.print("Enter the number of years: ");
		years = scanner.nextInt();

		capital = startingCapital;
		for (int i = 0; i < years; i++) {
			capital *= interest;
		}
		System.out.println("The capital will amount to €"+(long)capital );

		// task 2: years to double
		years = 1;
		// factor: multiplier to apply to amount after a number of years
		// remark: the number of years to double depends on the interest rate, but not on the starting amount
		double factor  = interest;
		while (factor < 2) {
			years++;
			factor *= interest ;
		}
		System.out.println("It takes " + years + " years to double the money." );
	}
}
