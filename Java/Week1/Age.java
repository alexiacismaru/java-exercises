package Week1;

import java.time.LocalDate;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        String name;
        int birthYear;
        int currentYear;
        int age;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();
        System.out.print("Dear " + name + ", please enter the year you were born: ");
        birthYear = keyboard.nextInt();
        currentYear = LocalDate.now().getYear();
        age = currentYear - birthYear;
        System.out.println("If all goes well you'll be  " + age + " by the end of the year.");
    }
}
