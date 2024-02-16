import java.util.Random;
import java.util.TreeSet;

public class LottoDraw {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();//ordered collection that doesn't contain doubles
        Random random = new Random();

        do {
            numbers.add(random.nextInt(45) + 1);//add numbers from 1 -> 45 --both inclusive-- in the TreeSet
        } while (numbers.size() < 6);//until you achieve 6 numbers

        System.out.print("The lotto numbers for today are:");
        for (Integer number : numbers) {
            System.out.print(" " + number);//after you get to 6 numbers, print them
        }
    }
}
