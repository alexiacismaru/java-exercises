package a04_point;

import a04_point.point.Point;
import a04_point.point.Point3D;

/**
 * Author: Jan de Rijke
 */
public class TestPoint {
	public static void main(String[] args) {

		Point defaultPoint = new Point();
		Point3D defaultPoint3D = new Point3D();
		System.out.println("Default point: " + defaultPoint);
		System.out.println("Default point3D: " + defaultPoint3D);

		Point point = new Point(1, 2);
		Point3D point3D = new Point3D(4, 5, 6);
		System.out.println("Coordinates point: " + point);
		System.out.println("Coordinates point3D: " + point3D);

		point3D.setX(1);
		point3D.setY(2);
		point3D.setZ(3);
		System.out.println("Relocated to: " + point3D);

		System.out.println("Point equals should be true: " + point.equals(new Point(1,2)));
		System.out.println("Point3D equals should be true: " + point3D.equals(new Point3D(1,2,3)));
		System.out.println("Point3D sequals should be false: " + point3D.equals(new Point3D(1,3,3)));
	}
}