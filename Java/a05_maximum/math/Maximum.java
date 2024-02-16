package be.kdg.java1.assignments.a05_maximum.math;

/**
 * @author Kristiaan Behiels
 * @version 1.0 10/10/13
 */

/*
This class should contain:

int attributes

one
two
three

constructors
a constructor with parameters for all attributes
a constructor with long parameters for all attributes
a constructor with double parameters for all attributes

methods
max: returns biggest attribute as a double

max with 3 int parameters: returns biggest argument as a double

max with 3 long parameters: returns biggest argument as a double
max with 3 double parameters: returns biggest argument as a double
 */
public class Maximum {
    private double one;
    private double two;
    private double three;

    // overloaded constructors
    public Maximum() {
        System.out.println("constructor without parameters called");
    }

    public Maximum(int one, int two, int three) {
        this.one = one;
        this.two = two;
        this.three = three;
        System.out.println("int constructor called");
    }

    public Maximum(long one, long two, long three) {
        this.one = one;
        this.two = two;
        this.three = three;
        System.out.println("long constructor called");
    }

    public Maximum(double one, double two, double three) {
        this.one = one;
        this.two = two;
        this.three = three;
        System.out.println("double constructor called");
    }

    // overloaded methods
    public double max() {
        return Math.max(one, Math.max(two, three));
    }

    public double max(int een, int twee, int drie) {
        System.out.println("int parameters method called");
        return Math.max(een, Math.max(twee, drie));
    }

    public double max(long een, long twee, long drie) {
	    System.out.println("long parameters method called");
        return Math.max(een, Math.max(twee, drie));
    }

    public double max(double een, double twee, double drie) {
	    System.out.println("double parameters method called");
        return Math.max(een, Math.max(twee, drie));
    }
}

