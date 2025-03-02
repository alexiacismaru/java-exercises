package Week5.Circle;

public class CircleTest {
    public static void main(String[] args) {
        CircleApp tooSmall = new CircleApp(5);
        System.out.println(tooSmall);

        CircleApp tooBig = new CircleApp(1200);
        System.out.println(tooBig);

        CircleApp small = new CircleApp(10, "Red");
        System.out.println(small);

        CircleApp big = new CircleApp(200, "Blue");
        System.out.println(big);

        System.out.printf("Difference in circumference (%s - %s): %.2f%n", big.getColour(), small.getColour(), big.deltaCircumference(small));
        System.out.printf("Difference in surface (%s - %s): %.2f%n", big.getColour(), small.getColour(), big.deltaSurface(small));
    }
}
