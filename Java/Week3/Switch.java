package Week3;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String letter;
        System.out.println("Insert a letter:");
        letter = String.valueOf(keyboard.nextInt());

        int value = switch (letter){
            case "A", "E", "I", "O", "U", "L", "N", "S", "T", "R" -> 1;
            case "D", "G" -> 2;
            case "B", "C", "M", "P" -> 3;
            case "F", "H", "V", "W", "Y" ->4;
            case "K" -> 5;
            case "J", "X" -> 8;
            case "Q", "Z" -> 10;
            default -> {
                System.out.println("Unexpected letter:");
                yield 0;
            }
        };
        System.out.println(value);
    }
}
