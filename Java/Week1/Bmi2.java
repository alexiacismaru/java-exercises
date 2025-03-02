package Week1;

import java.util.Scanner;

public class Bmi2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int weight;
        double length;
        double bmi;

        System.out.println("Dear patient, this programma will calculate your BMI.");

        System.out.print("Enter your weight in kilograms: ");
        weight = keyboard.nextInt();

        System.out.print("Enter your length in meters: ");
        length = keyboard.nextDouble();

        bmi = weight / (length * length);
        System.out.println("Your BMI is: " + bmi);
        System.out.print("Your BMI class is: ");

        if (bmi < 18) {
            System.out.println("underweighted.");
            } else if (bmi < 25) {
            System.out.println("healthy weight.");
                 } else if (bmi < 30) {
                        System.out.println("overweighted.");
                            } else {
                                System.out.println("obese.");
                            }
    }
    public static void masin(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int gewicht;
        double lengte;
        double bmi;

        System.out.println("Beste patient, dit programma berekent je BMI.");

        System.out.print("Geef je gewicht in kilogram: ");
        gewicht = keyboard.nextInt();

        System.out.print("Geef je lengte in meters: ");
        lengte = keyboard.nextDouble();
        bmi = gewicht / (lengte * lengte);

        System.out.println("Je BMI is: " + bmi);

        System.out.print("Dat is: ");

        if (bmi < 18) {
            System.out.println("ondergewicht!");
            } else if (bmi < 25) {
            System.out.println("in orde!");
                } else if (bmi < 30) {
            System.out.println("overgewicht!");
                    } else {
                        System.out.println("obesitas!");
        }
    }
}
