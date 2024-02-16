package be.kdg.java1.assignments.a07_circle.test;

import be.kdg.java1.assignments.a07_circle.graphics.Circle;

public class CircleApp {
    public static void main(String[] args) {
        Circle tooSmall = new Circle(5);
        System.out.println(tooSmall);
        
        Circle tooBig = new Circle(1200);
        System.out.println(tooBig);
        
        Circle small = new Circle(10, "Red");
        System.out.println(small);
        
        Circle big = new Circle(200, "Blue");
        System.out.println(big);
    
        System.out.printf("Difference in circumference (%s - %s): %.2f%n", big.getColour(), small.getColour(), big.deltaCircumference(small));
        System.out.printf("Difference in surface (%s - %s): %.2f%n", big.getColour(), small.getColour(), big.deltaSurface(small));
    }  // main()
}  // class
