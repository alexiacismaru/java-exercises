package be.kdg.prog1;

public class Main {
    public static void main(String[] args) {
        String one = "abc";
        String two = "abc";
        String three = new String("abc");

        System.out.println(one == two);
        System.out.println(one == three);
        System.out.println(two == three);

        System.out.println(one.equals(two));
        System.out.println(one.equals(three));
        System.out.println(two.equals(three));
    }
}
