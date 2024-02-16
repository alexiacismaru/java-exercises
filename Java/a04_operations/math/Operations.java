package be.kdg.java1.assignments.a04_operations.math;

public class Operations {
    private int numberOne;
    private int numberTwo;

    public Operations(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public int sum() {
        return numberOne + numberTwo;
    }

    public int difference() {
        return numberOne - numberTwo;
    }

    public int product() {
        return numberOne * numberTwo;
    }

    public double quotient() {
        return (double) numberOne / numberTwo;
    }
}  // class
