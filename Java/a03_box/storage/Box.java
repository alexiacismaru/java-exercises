package be.kdg.java1.assignments.a03_box.storage;

public class Box {
    private String type;
    private double length;
    private double width;
    private double height;

    public Box(String type, double length, double width, double height) {
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(String type, double length) {
        this(type, length, length, length);
    }

    public double surface() {
        return 2 * (width * length + width * height + length * height);
    }

    public double volume() {
        return length * width * height;
    }

    public double tapeLength() {
        double bottom = 2 * (length + width);
        double front = 2 * (length + height);
        double side = 2 * (width + height);
        return Math.min(side, (Math.min(bottom, front)));
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Type: ").append(type).append('\n');
        result.append(String.format("Length: %.1fcm", length)).append('\n');
        result.append(String.format("Width: %.1fcm", width)).append('\n');
        result.append(String.format("Hieght: %.1fcm", height)).append('\n');
        result.append(String.format("Surface: %.1fcm²", surface())).append('\n');
        result.append(String.format("Volume: %.1fcm³", volume())).append('\n');
        result.append(String.format("Minimum tapelength: %.1fcm", tapeLength())).append('\n');
        return result.toString();
    }
}
