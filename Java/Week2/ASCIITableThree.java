package Week2;

import java.util.Scanner;

public class ASCIITableThree {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        final long  MINIMUM_DIVIDEND = 1000000000000L;
        final long MINIMUM_DIVISOR = 10000000L;
        long dividend;
        long divisor;
        System.out.println("Insert a number of at least 13 digits:");
        dividend = keyboard.nextInt();
        System.out.println("Insert a number of at least 8 digits:");
        divisor = keyboard.nextInt();
        if (dividend > MINIMUM_DIVIDEND && divisor > MINIMUM_DIVISOR) {
            System.out.print("This number is too small!");
        } else {
            long quotient = dividend / divisor;
            System.out.print(quotient);
        }
    }
}
