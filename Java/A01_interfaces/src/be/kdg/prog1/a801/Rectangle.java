package be.kdg.prog1.a801;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        setDimensions(width, height);
    }

    public void setDimensions(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void print() {
        System.out.println("Rectangle");
        System.out.println("=========");
        System.out.printf("Position: (%d, %d)%n", getX(), getY());
        System.out.println("Width:    " + width);
        System.out.println("Height:   " + height);
    }
}
