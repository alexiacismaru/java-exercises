package Week3;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String month;
        String monthName;
        System.out.println("Insert a month number:");
        month = String.valueOf(keyboard.nextInt());
        monthName = String.valueOf(keyboard.nextInt());

        int value = switch (month){
            case "1", "3", "5", "7", "8", "10", "12"-> 31;
            case "2" -> 28;
            case "4", "6", "11"-> 30;
            default -> {
                System.out.println("Unexpected number:");
                yield 0;
            }
        };
        String valueTwo = switch (monthName){
            case "1" -> "January";
            case "2" -> "February";
            case "3"-> "March";
            case "4"-> "April";
            case "5" -> "May";
            case "6" -> "June";
            case "7" -> "July";
            case "8" -> "August";
            case "9" -> "September";
            case "10" -> "October";
            case "11" -> "November";
            case "12" -> "December";
            default -> {
                System.out.println("Unexpected number:");
                yield "Incorrect month";
            }
        };
        System.out.println(valueTwo + "has" + value + "days.");
    }
}
