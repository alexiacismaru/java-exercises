package be.kdg.prog1.a802;

public class Car implements Printable, Comparable {
    private String brand;
    private String model;
    private String licensePlate;

    public Car(String brand, String model, String licensePlate) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
    }

    @Override
    public void print() {
        System.out.println("Car");
        System.out.println("===");
        System.out.println("Brand:         " + brand);
        System.out.println("Model:         " + model);
        System.out.println("License plate: " + licensePlate);
    }

    @Override
    public boolean isEqualTo(Object object) {
        if (object instanceof Car) {
            Car otherCar = (Car) object;
            return brand.equals(otherCar.brand)
                    && model.equals(otherCar.model);
        } else {
            return false;
        }
    }

    @Override
    public boolean isGreaterThan(Object object) {
        if (object instanceof Car) {
            Car otherCar = (Car) object;
            if (brand.equals(otherCar.brand)) {
                return model.compareTo(otherCar.model) > 0;
            } else {
                return brand.compareTo(otherCar.brand) > 0;
            }
        } else {
            return false;
        }
    }

    @Override
    public boolean isLessThan(Object object) {
        if (object instanceof Car) {
            Car otherCar = (Car) object;
            if (brand.equals(otherCar.brand)) {
                return model.compareTo(otherCar.model) < 0;
            } else {
                return brand.compareTo(otherCar.brand) < 0;
            }
        } else {
            return false;
        }
    }
}
