package Week1;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int weight;
        double length;
        double bmi;
        System.out.println("Dear patient, this programme will calculate your BMI.");
        System.out.print("Enter your weight in kilograms: ");
        weight = keyboard.nextInt();
        System.out.print("Enter your length in meters: ");
        length = keyboard.nextDouble();
        bmi = weight / (length * length);
        System.out.println("Your BMI is: " + bmi);
    }
}
