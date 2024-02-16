package a10_shape.be.kdg.oo.shape.geometry;

public abstract class Shape {

	protected int x, y;

	public abstract double getArea();

	public abstract double getPerimeter();

	public Shape() {
	}

	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean equals(Object obj) {
		if (obj == null ||!(getClass() !=   obj.getClass())) {
			return false;
		}
		Shape other = (Shape) obj;
		return (x == other.x
			&& y == other.y);
	}

	@Override
	public String toString() {
		return String.format("%s at (%d,%d) with perimeter %.2f and surface %.2f",
			"Shape",
			x,
			y,
			getPerimeter(),
			getArea());
	}
}
