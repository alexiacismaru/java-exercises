package be.kdg.prog1;

import java.util.Scanner;

public class A06_1DaysInMonthLeap {
    public static void main(String[] args) {

        Scanner keyb = new Scanner(System.in);
        System.out.print("Enter a month number (1 = januari): ");
        int month = keyb.nextInt();
        System.out.print("Enter a year (4 digits):  ");
	    int year = keyb.nextInt();
	    String monthName;
        int days;
        switch (month) {
            case 1:
                monthName = "january";
                days = 31;
                break;
            case 2:
                monthName = "february";
                days = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)) ? 29 :
	                28;
                break;
            case 3:
                monthName = "march";
                days = 31;
                break;
            case 4:
                monthName = "april";
                days = 30;
                break;
            case 5:
                monthName = "may";
                days = 31;
                break;
            case 6:
                monthName = "june";
                days = 30;
                break;
            case 7:
                monthName = "july";
                days = 31;
                break;
            case 8:
                monthName = "august";
                days = 31;
                break;
            case 9:
                monthName = "september";
                days = 30;
                break;
            case 10:
                monthName = "october";
                days = 31;
                break;
            case 11:
                monthName = "november";
                days = 30;
                break;
            case 12:
                monthName = "december";
                days = 31;
                break;
            default:
                System.out.println("Wrong month number");
                monthName = "invalid";
                days = 0;

        }
        if (days > 0) {
            System.out.println("In " + year + " " +
	            monthName + " has " + days + " days.");
        }
    }
}
