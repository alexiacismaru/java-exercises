package be.kdg.prog1;

/**
 * Author: derijkej
 */
public class A03_3For {
	public static void main(String[] args) {

		System.out.print("Numbers from " + 120 + " to " + 100 + ": ");
		for (int counter = 120;counter >= 100;counter--){
			System.out.print(counter + " ");
		}
		System.out.println();

		System.out.print("Multiples of  " + 3 +  " below " + 50 + ": ");
		for (int counter = 3;counter <50;counter+=3){
			System.out.print(counter + " ");
		}
		System.out.println();

		System.out.print("Powers of "+5+": ");
		for (int counter = 5;counter <10_000;counter*= 5){
			System.out.print(counter + " ");
		}
		System.out.println();

		System.out.print("The alfabet: ");
		for (char counter = 'A';counter <='Z';counter++){
			System.out.print(counter + " ");
		}
	}
}
