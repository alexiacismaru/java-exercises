package Week4;

import java.util.Random;

public class RandomThree {
    public static void main(String[] args){
        Random random = new Random();
        for(int x = 0; x < 3; x++){
            System.out.print(random.nextDouble() + " ");
        }
    }
}
