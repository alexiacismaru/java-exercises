package be.kdg.prog1.a805;

public class Point {
    private static final String COLOR = "red";
    private static int count = 0;

    public static String getColor() {
        return Point.COLOR;
    }

    public static int getCount() {
        return Point.count;
    }

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;

        Point.count++;
    }
}
