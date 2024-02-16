package be.kdg.prog1.a801;

public class Main {
    public static void main(String[] args) {
        //part1();
        //part2();
        //part3();
    }

    private static void part1() {
        Car[] cars = {
                new Car("Peugeot", "208", "1-ABC-123"),
                new Car("Opel", "Corsa", "1-DEF-456"),
                new Car("Volkswagen", "Golf", "1-GHI-789"),
                new Car("Renault", "Clio", "1-JKL-012"),
                new Car("Ford", "Fiesta", "1-MNO-345")
        };

        System.out.println(">>>>>>>>>>>>>>>>>>>> PART 1 <<<<<<<<<<<<<<<<<<<<");
        for (Car car : cars) {
            car.print();
            System.out.println(); // empty line
        }
    }

    private static void part2() {
        Printable[] printables = {
                new Car("Peugeot", "208", "1-ABC-123"),
                new Circle(10, 10, 5),
                new Circle(50, 100, 20),
                new Rectangle(0, 100, 20, 30),
                new Car("Ford", "Fiesta", "1-MNO-345")
        };

        System.out.println(">>>>>>>>>>>>>>>>>>>> PART 2 <<<<<<<<<<<<<<<<<<<<");
        for (Printable printable : printables) {
            printable.print();
            System.out.println(); // empty line
        }
    }

    private static void part3() {
        Printable[] printables = {
                new Circle(50, 50, 50),
                new Circle(0, 0, 100),
                new Rectangle(100, 100, 20, 20),
                new Rectangle(-50, -50, 30, 30),
                new Car("Volkswagen", "Golf", "1-GHI-789"),
        };

        System.out.println(">>>>>>>>>>>>>>>>>>>> PART 3 <<<<<<<<<<<<<<<<<<<<");
        for (Printable printable : printables) {
            printable.print();
            System.out.println(); // empty line
        }
    }
}
