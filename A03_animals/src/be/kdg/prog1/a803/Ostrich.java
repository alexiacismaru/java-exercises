package be.kdg.prog1.a803;

public class Ostrich implements Named, EggLaying {
    private String name;
    private int numberOfEggsPerYear;

    public Ostrich(String name, int numberOfEggsPerYear) {
        this.name = name;
        this.numberOfEggsPerYear = numberOfEggsPerYear;
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
    public String toString() {
        return "Name: " + getName() + "\n"
                + "Eggs: " + getNumberOfEggsPerYear() + "\n";
    }
}
