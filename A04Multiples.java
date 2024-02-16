package be.kdg.prog1;

import java.util.Scanner;

public class A04Multiples {
    public static void main(String[] args) {
        final int MAX = 100;
        Scanner keyb = new Scanner(System.in);
        System.out.print("Which number would you like to see the multiples of? ");
        int basis = keyb.nextInt();
        int veelvoud = basis;
        while (veelvoud < MAX) {
            System.out.println(veelvoud);
            veelvoud += basis;
        }

    }
}
