package a10_shape.be.kdg.oo.shape.geometry;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
	@Override
	public String toString() {
		return String.format("%s at (%d,%d) with perimeter %.2f and surface %.2f",
			"Circle",
			x,
			y,
			getPerimeter(),
			getArea());
	}
}
