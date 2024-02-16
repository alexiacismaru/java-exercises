package be.kdg.prog1;

public class A07Hexadecimal {
	public static void main(String[] args) {

		char a = 'A';
		for (int i = 0; i < 9; i++) {
			System.out.print(i + " ");
		}
		for (int i = 0; i < 5; i++) {
			System.out.print((char)(a + i) + " ");
		}
	}
}

