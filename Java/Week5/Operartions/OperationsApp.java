package Week5.Operartions;

public class OperationsApp {
    private int numberOne;
    private int numberTwo;

    public OperationsApp(int numberOne, int numberTwo) {
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
}
