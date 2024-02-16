package a04_point.point;

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

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Point3D)) return false;
		Point3D point = (Point3D) o;
		return super.equals(point) && z == point.z;
	}

	@Override
	public int hashCode() {
		return  super.hashCode()^z;
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
