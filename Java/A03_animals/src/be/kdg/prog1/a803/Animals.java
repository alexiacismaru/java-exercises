package be.kdg.prog1.a803;

public class Animals {
    private Named[] animals;
    private int amount;

    public Animals() {
        animals = new Named[100];
        amount = 0;
    }

    public void add(Named named) {
        animals[amount] = named;
        amount++;
    }

    public void print() {
        for (int i = 0; i < amount; i++) {
            System.out.println(animals[i]);
        }
    }
}
