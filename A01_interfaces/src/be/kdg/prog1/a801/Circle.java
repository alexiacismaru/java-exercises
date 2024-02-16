package be.kdg.prog1.a801;

public class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * radius * 2;
    }

    @Override
    public void print() {
        System.out.println("Circle");
        System.out.println("======");
        System.out.printf("Position: (%d, %d)%n", getX(), getY());
        System.out.println("Radius:   " + radius);
    }
}
