package a02_point.point;

/**
 * Author: Jan de Rijke
 */
public class Point {

	int x,y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}

	public Point() {
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return String.format("x: %d y: %d", x, y);
	}

	public void setX(int i) {
		x=i;
	}

	public void setY(int i) {
		y=i;
	}
}
