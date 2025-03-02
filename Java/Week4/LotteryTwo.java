package Week4;

import java.util.Random;

public class LotteryTwo {
    public static void main(String[] args) {
        Random random = new Random(100);
        for (int i = 0; i < 10; i++) {
            System.out.println("Lottery number " + (i + 1) + ": " + (random.nextInt(45) + 1));
        }
    }
}
