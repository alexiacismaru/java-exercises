package be.kdg.java1.assignments.a05_temperatures;

import java.util.Scanner;

public class TemperaturesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUMBER_OF_TEMPERATURES = 7; /* ... or 3 */
        float[] temperatures = new float[NUMBER_OF_TEMPERATURES];

        System.out.println("Please enter " + temperatures.length + " temperatures:");
        for (int i = 0; i < temperatures.length; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextFloat();
        }
        System.out.println();

        System.out.println("Summary:");
        System.out.println("=================");
        for (int i = 0; i < temperatures.length; i++) {
            System.out.printf("Day %d: %10.1f%n", i + 1, temperatures[i]);
        }
        System.out.println("=================");

        float sum = 0.0f;
        for (float temperature : temperatures) {
            sum += temperature;
        }
        System.out.printf("Average: %.2f", sum / temperatures.length);
    }  // main()
}  // class
