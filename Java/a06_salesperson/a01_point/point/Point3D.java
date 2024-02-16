package a01_point.point;

/**
 * Author: Jan de Rijke
 */
public class Point3D extends Point {
	private final int z;

	public Point3D(int x, int y, int z) {
		super(x,y);
		this.z=z;
	}

	public int getZ() {
		return z;
	}
}
