package be.kdg.prog1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            System.out.print((random.nextInt(6) + 1) + " ");
        }
        System.out.println();

        for (int i = 0; i < 4; i++) {
            System.out.print(random.nextBoolean() + " ");
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.print(random.nextDouble() + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("Additional challenge");
        System.out.println("====================");
        for (int i = 0; i < 10; i++) {
            System.out.print((random.nextInt(101) + 900) + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print((random.nextDouble() * 5 + 5) + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print((random.nextInt(51) * 2) + " ");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print((random.nextInt(34) * 3) + " ");
        }
        System.out.println();
    }
}
