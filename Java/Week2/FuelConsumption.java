package Week2;

import java.util.Scanner;

public class FuelConsumption {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter four different digits");
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int c = keyboard.nextInt();
        int d = keyboard.nextInt();
        int finalNumber;
        finalNumber = a + b + c + d;
                System.out.print(finalNumber);
    }
}
