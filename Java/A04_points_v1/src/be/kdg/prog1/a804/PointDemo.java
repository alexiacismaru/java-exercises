package be.kdg.prog1.a804;

public class PointDemo {
    public static void main(String[] args) {
        Point p1 = new Point(50, 50);
        System.out.println("Color: " + Point.COLOR);
        System.out.println("Count: " + Point.count);

        Point p2 = new Point(150, -50);
        System.out.println("Color: " + Point.COLOR);
        System.out.println("Count: " + Point.count);

        Point p3 = new Point(0, 0);
        System.out.println("Color: " + Point.COLOR);
        System.out.println("Count: " + Point.count);

        Point p4 = new Point(100, 100);
        System.out.println("Color: " + Point.COLOR);
        System.out.println("Count: " + Point.count);

        Point p5 = new Point(-100, 250);
        System.out.println("Color: " + Point.COLOR);
        System.out.println("Count: " + Point.count);
    }
}
