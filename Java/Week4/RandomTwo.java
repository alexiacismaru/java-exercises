package Week4;

import java.util.Random;

public class RandomTwo {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            System.out.print((random.nextInt(6) + 1) + " ");}
    }
}
