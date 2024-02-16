package be.kdg.prog1.a804;

public class Point {
    public static final String COLOR = "red";
    public static int count = 0;

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;

        Point.count++;
    }
}
