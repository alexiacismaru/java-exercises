package Week4;

import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        Random random = new Random();
        for (int number = 1; number < 45; number++) {
            System.out.println("Lottery number " + (number + 1) + ": " + (random.nextInt(45) + 1));
        }
    }
}
