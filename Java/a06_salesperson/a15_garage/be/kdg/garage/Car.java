package a15_garage.be.kdg.garage;


public class Car {
    private final String brand;
    private Garage garage;

    public Car(String brand) {
        this(brand, null);
    }

    public Car(Car car) {
        this(car.brand, car.garage);
    }

    public Car(String brand, Garage garage) {
        this.brand = brand;
        this.garage = garage;
    }

    public String getBrand() {
        return brand;
    }

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    @Override
    public String toString() {
         return "Car: " + brand + " " + garage;
    }
}
