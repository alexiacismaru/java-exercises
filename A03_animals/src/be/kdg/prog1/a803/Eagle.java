package be.kdg.prog1.a803;

public class Eagle implements Named, EggLaying, Flying {
    private String name;
    private int numberOfEggsPerYear;
    private int maxSpeed;
    private int divingSpeed;

    public Eagle(String name, int numberOfEggsPerYear, int maxSpeed, int divingSpeed) {
        this.name = name;
        this.numberOfEggsPerYear = numberOfEggsPerYear;
        this.maxSpeed = maxSpeed;
        this.divingSpeed = divingSpeed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getNumberOfEggsPerYear() {
        return numberOfEggsPerYear;
    }

    @Override
    public int getMaxFlyingSpeed() {
        return maxSpeed;
    }

    public int getDivingSpeed() {
        return divingSpeed;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n"
                + "Eggs: " + getNumberOfEggsPerYear() + "\n"
                + "Speed: " + getMaxFlyingSpeed() + "\n"
                + "Divingspeed: " + getDivingSpeed() + "\n";
    }
}
