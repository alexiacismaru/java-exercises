package be.kdg.prog1;

/**
 * Author: derijkej
 */
public class A03_2DoWhile {
	public static void main(String[] args) {
		int counter = 120;
		int limit =100;
		System.out.print("Numbers from " + counter + " to " + limit + ": ");
		while (counter >= limit){
			System.out.print(counter-- + " ");
		}
		System.out.println();
		counter = 0;
		limit = 50;
		int base = 3;
		counter += base;
		System.out.print("Multiples of  " + base +  " below " + limit + ": ");
		do {
			System.out.print(counter + " ");
			counter += base;
		}while (counter < limit);
		counter = 1;
		base = 5;
		limit =10_000;
		System.out.println();
		System.out.print("Powers of "+base+": ");
		do {
			System.out.print(counter + " ");
			counter *= 5;
		}while (counter < limit);
		char letter = 'A';
		char last = 'Z';
		System.out.println();
		System.out.print("The alfabet: ");
		do{
			System.out.print(letter++ + " ");
		}while (letter <= last);
	}
}
