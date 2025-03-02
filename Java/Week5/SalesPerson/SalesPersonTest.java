package Week5.SalesPerson;

import java.util.Scanner;

public class SalesPersonTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        double revenue;

        name = "Jan";
        System.out.printf("Enter %s's revenue: ", name);
        SalesPersonApp one = new SalesPersonApp(name, scanner.nextDouble());

        name = "Laetitia";
        System.out.printf("Enter %s's revenue: ", name);
        SalesPersonApp two = new SalesPersonApp(name, scanner.nextDouble());

        name = "Lotte";
        System.out.printf("Enter %s's revenue: ", name);
        SalesPersonApp three = new SalesPersonApp(name, scanner.nextDouble());

        SalesPersonApp top;
        top = one.hasMoreRevenueThan(two) ? one : two;
        top = top.hasMoreRevenueThan(three) ? top : three;
        System.out.printf("Our top earner is %s!\n", top.getName());
    }
}
