package Week5.Maximum;

public class MaximumApp {
    private double one;
    private double two;
    private double three;

    // overloaded constructors
    public MaximumApp() {
        System.out.println("constructor without parameters called");
    }

    public MaximumApp(int one, int two, int three) {
        this.one = one;
        this.two = two;
        this.three = three;
        System.out.println("int constructor called");
    }

    public MaximumApp(long one, long two, long three) {
        this.one = one;
        this.two = two;
        this.three = three;
        System.out.println("long constructor called");
    }

    public MaximumApp(double one, double two, double three) {
        this.one = one;
        this.two = two;
        this.three = three;
        System.out.println("double constructor called");
    }

    public double max() {
        return Math.max(one, Math.max(two, three));
    }

    public double max(int een, int twee, int drie) {
        System.out.println("int parameters method called");
        return Math.max(een, Math.max(twee, drie));
    }

    public double max(long een, long twee, long drie) {
        System.out.println("long parameters method called");
        return Math.max(een, Math.max(twee, drie));
    }

    public double max(double een, double twee, double drie) {
        System.out.println("double parameters method called");
        return Math.max(een, Math.max(twee, drie));
    }
}
