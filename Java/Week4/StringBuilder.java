package Week4;

import java.util.Scanner;

public class StringBuilder {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your first name and last name, separated by a space: ");
        String name = keyboard.nextLine();
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder(name);
        StringBuilder three = new StringBuilder(name);
        StringBuilder four = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            if (i == 0 || name.charAt(i - 1) == ' ') {
                one.append(name.charAt(i));
            }
        }

        two.reverse();

        while (three.indexOf("e") != -1) {
            int positionOfE = three.indexOf("e");
            three.setCharAt(positionOfE, 'a');
        }

        StringBuilder sb = new StringBuilder(name);
        Random random = new Random();
        while (sb.length() > 0) {
            int index = random.nextInt(sb.length());
            four.append(sb.charAt(index));
            sb.deleteCharAt(index);
        }

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
    }
}
