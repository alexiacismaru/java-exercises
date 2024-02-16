package a10_shape.be.kdg.oo.shape.geometry;

public class Rectangle extends Shape {

	private int width;
	private int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public double getPerimeter() {
		return (width + height) * 2;
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj)) return false;
		Rectangle other = (Rectangle) obj;
		return ( width == other.width
			&& height == other.height);
	}

	@Override
	public String toString() {
		return String.format("%s at (%d,%d) with perimeter %.2f and surface %.2f",
			"Rectangle",
			x,
			y,
			getPerimeter(),
			getArea());
	}

	@Override
	public int hashCode() {
		return (x ^ y ^ width ^ height);
	}

}
