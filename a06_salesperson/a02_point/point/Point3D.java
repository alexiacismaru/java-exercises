package a02_point.point;

/**
 * Author: Jan de Rijke
 */
public class Point3D extends Point {
	private  int z;

	public Point3D(int x, int y, int z) {
		super(x,y);
		this.z=z;
	}

	public Point3D() {
	}

	public int getZ() {
		return z;
	}

	public String toString() {
		return String.format("%s z: %d", super.toString(), z);

	}

	public void setZ(int i) {
		z=i;
	}
}
