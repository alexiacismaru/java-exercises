package be.kdg.java1.assignments.a07_circle.graphics;

public class Circle {
    /*
    attribute(s)
     */
    private int radius;
    private String colour;

    /*
    constructor(s)
     */
    public Circle(int radius) {
        this(radius, "Black");
    }
    
    public Circle(int radius, String colour) {
        setRadius(radius);
        setColour(colour);
    }
    
    /*
    getter(s)/setter(s)
     */
    
    public int getRadius() {
        return radius;
    }
    
    public void setRadius(int radius) {
        final int MIN_RADIUS = 10;
        final int MAX_RADIUS = 500;
    
        if ((radius >= MIN_RADIUS) && (radius <= MAX_RADIUS)) {
            this.radius = radius;
        } else  {
            System.out.printf("Invalid radius %d \n", radius);
        }
    }
    
    public String getColour() {
        return colour;
    }
    
    public void setColour(String colour) {
        this.colour = colour;
    }
    
    /*
        method(s)
         */
    //  2 x PI x r
    public double circumference() {
        return 2 * Math.PI * radius;
    }

    //
    // PI * r²
    public double surface() {
        return Math.PI * radius * radius;
    }

    // Absolute difference circumference
    public double deltaCircumference(Circle other) {
       return Math.abs(this.circumference() - other.circumference());
    }

	// Absolute difference surface
    public double deltaSurface(Circle other) {
        return Math.abs(this.surface() - other.surface());
    }

    @Override
    public String toString() {
        return String.format("Colour:%-8s  Radius:%-5d  Circumference:%-10.2f  Surface: %-10.2f",
	        colour, radius, circumference(), surface());
    }
}  // class
