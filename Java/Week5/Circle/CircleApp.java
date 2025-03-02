package Week5.Circle;

public class CircleApp {

    private int radius;
    private String colour;

    public CircleApp(int radius) {
        this(radius, "Black");
    }

    public CircleApp(int radius, String colour) {
        setRadius(radius);
        setColour(colour);
    }

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

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public double surface() {
        return Math.PI * radius * radius;
    }

    public double deltaCircumference(CircleApp other) {
        return Math.abs(this.circumference() - other.circumference());
    }

    public double deltaSurface(CircleApp other) {
        return Math.abs(this.surface() - other.surface());
    }
    @Override
    public String toString() {
        return String.format("Colour:%-8s  Radius:%-5d  Circumference:%-10.2f  Surface: %-10.2f",
                colour, radius, circumference(), surface());
    }
}
