package Week2;

import java.util.Scanner;

public class ASCITable {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insert the VAT value:");
        int VAT = keyboard.nextInt();
        System.out.println("Enter you amount");
        int amount = keyboard.nextInt();
        int VATExclusiveAmount = amount + VAT/100;
        System.out.print(VATExclusiveAmount);
        if(amount == VATExclusiveAmount){
            System.out.print(amount);
        } else {
            System.out.print(amount + VAT/100);
        }
    }
}
