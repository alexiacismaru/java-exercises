package Week5.Operartions;

import java.util.Scanner;

public class OperationTest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter the first integer: ");
        int first = keyboard.nextInt();
        System.out.print("Please enter the second integer: ");
        int second = keyboard.nextInt();

        OperationsApp operations = new OperationsApp(first, second);

        System.out.printf("The sum is %d\n", operations.sum());
        System.out.printf("The difference is %d\n", operations.difference());
        System.out.printf("The product is %d\n", operations.product());
        System.out.printf("The quotient is %.2f\n", operations.quotient());
    }
}
