package Week3;

public class Factorial {
    public static void main(String[] args) {
        int value = 20;
        while (value > 1) {
            System.out.print(value--);
            int i, fact = 1;
            for (i = 1; i <= value; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of " + value + " is: " + fact);
        }
    }
}
