package Week2;

public class Pizza {
    public static void main(String[] args) {
        char i;
        for (i = 32; i <= 127; i++) {
            System.out.print(i);
            char x;
            for (x = 128; x <= 255; x++) {
                System.out.print(x);
            }
        }
    }
}
