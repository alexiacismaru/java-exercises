package a15_garage.be.kdg;

import a15_garage.be.kdg.garage.Car;
import a15_garage.be.kdg.garage.Garage;


public class GarageTester {
    public static void main(String[] args) {
        Car car = new Car("Ford S-MAX");
        Garage garage = new Garage("Neyt");
        car.setGarage(garage);

        System.out.println(car);  // impliciete call to toString

        car = new Car("Ford Focus", garage);

        System.out.println(car);  // impliciete call to toString

        car = new Car("Mercedes C", new Garage("Van Winkel"));

        System.out.println(car);  // impliciete call to toString

        Car copy = new Car(car);

        System.out.println(copy);  // impliciete call to toString
    }
}

/*
Car: Ford S-MAX Garage: Neyt
Car: Ford Focus Garage: Neyt
Car: Mercedes C Garage: Van Winkel
Car: Mercedes C Garage: Van Winkel
*/