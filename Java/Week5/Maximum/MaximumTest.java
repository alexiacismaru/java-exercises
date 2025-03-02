package Week5.Maximum;

public class MaximumTest {
    public static void main(String[] args) {
        MaximumApp maximum = new MaximumApp(1, 3, 2);
        System.out.println("maximum = " + maximum.max());

        maximum = new MaximumApp(1L, 2, 3);
        System.out.println("maximum = " + maximum.max());

        maximum = new MaximumApp(3L, 2.0, 1);
        System.out.println("maximum = " + maximum.max());

        maximum = new MaximumApp();
        System.out.println("maximum = " + maximum.max(1, 3, 2));

        maximum = new MaximumApp();
        System.out.println("maximum = " + maximum.max(1, 3, 2L));

        maximum = new MaximumApp();
        System.out.println("maximum = " + maximum.max(1.0, 3, 2));
    }  // main()
}
