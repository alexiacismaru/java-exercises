package be.kdg.prog1.a802;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Peugeot", "208", "1-ABC-123");
        Car car2 = new Car("Peugeot", "208", "2-XYZ-123");
        Car car3 = new Car("Opel", "Corsa", "1-DEF-456");
        Rectangle rectangle1 = new Rectangle(10, 10, 100, 100);
        Rectangle rectangle2 = new Rectangle(0, 0, 100, 100);
        Rectangle rectangle3 = new Rectangle(-50, -50, 50, 200);
        Circle circle1 = new Circle(0, 0, 50);
        Circle circle2 = new Circle(100, 100, 50);
        Circle circle3 = new Circle(0, 0, 10);

        System.out.println("Testing the Car class");
        System.out.println("=====================");
        System.out.println("This should print 'true': " + car1.isEqualTo(car2));
        System.out.println("This should print 'false': " + car1.isEqualTo(car3));
        System.out.println("This should print 'false': " + car1.isGreaterThan(car2));
        System.out.println("This should print 'true': " + car1.isGreaterThan(car3));
        System.out.println("This should print 'false': " + car1.isLessThan(car3));
        System.out.println();
        System.out.println("Testing the Rectangle class");
        System.out.println("===========================");
        System.out.println("This should print 'true': " + rectangle1.isEqualTo(rectangle2));
        System.out.println("This should print 'false': " + rectangle1.isEqualTo(rectangle3));
        System.out.println("This should print 'false': " + rectangle1.isGreaterThan(rectangle2));
        System.out.println("This should print 'true': " + rectangle1.isGreaterThan(rectangle3));
        System.out.println("This should print 'false': " + rectangle1.isLessThan(rectangle3));
        System.out.println();
        System.out.println("Testing the Circle class");
        System.out.println("========================");
        System.out.println("This should print 'true': " + circle1.isEqualTo(circle2));
        System.out.println("This should print 'false': " + circle1.isEqualTo(circle3));
        System.out.println("This should print 'false': " + circle1.isGreaterThan(circle2));
        System.out.println("This should print 'true': " + circle1.isGreaterThan(circle3));
        System.out.println("This should print 'false': " + circle1.isLessThan(circle3));
        System.out.println();
        System.out.println("Comparing different types");
        System.out.println("=========================");
        System.out.println("This should print 'false': " + circle1.isEqualTo(rectangle1));
        System.out.println("This should print 'false': " + rectangle1.isEqualTo(car1));
        System.out.println("This should print 'false': " + car1.isEqualTo(circle1));
    }
}
