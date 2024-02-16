package be.kdg.java1.assignments.a06_salesperson.test;

import be.kdg.java1.assignments.a06_salesperson.sales.SalesPerson;

import java.util.Scanner;

public class SalesPersonApp {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        double revenue;
        
        name = "Jan";
        System.out.printf("Enter %s's revenue: ", name);
        SalesPerson one = new SalesPerson(name, scanner.nextDouble());
        
        name = "Laetitia";
        System.out.printf("Enter %s's revenue: ", name);
        SalesPerson two = new SalesPerson(name, scanner.nextDouble());
        
        name = "Lotte";
        System.out.printf("Enter %s's revenue: ", name);
        SalesPerson three = new SalesPerson(name, scanner.nextDouble());
        
        // Print out the name of the top earner!
        SalesPerson top;
        top = one.hasMoreRevenueThan(two) ? one : two;
        top = top.hasMoreRevenueThan(three) ? top : three;
        System.out.printf("Our top earner is %s!\n", top.getName());
    }  // main()
    
}  // class
