package a15_garage.be.kdg.garage;


public class Garage {
    private String name;

    public Garage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Garage: " + name;
    }

}
