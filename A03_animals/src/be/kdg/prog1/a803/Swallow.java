package be.kdg.prog1.a803;

public class Swallow implements Named, EggLaying, Flying {
    private String name;
    private int numberOfEggsPerYear;
    private int maxSpeed;

    public Swallow(String name, int numberOfEggsPerYear, int maxSpeed) {
        this.name = name;
        this.numberOfEggsPerYear = numberOfEggsPerYear;
        this.maxSpeed = maxSpeed;
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

    @Override
    public String toString() {
        return "Name: " + getName() + "\n"
                + "Eggs: " + getNumberOfEggsPerYear() + "\n"
                + "Speed: " + getMaxFlyingSpeed() + "\n";
    }
}
