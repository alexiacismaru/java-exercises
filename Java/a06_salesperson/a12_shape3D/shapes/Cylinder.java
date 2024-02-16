package a12_shape3D.shapes;

/**
 * Author: Jan de Rijke
 */
public class Cylinder extends Shape3D{

	double radius=1.0;
	double length=1.0;


	public Cylinder() {
	}

	public Cylinder(String colour, double radius,double length) {
		super(colour);
		this.radius = radius;
		this.length=length;
	}

	public Cylinder(double radius,double length) {
		this.radius = radius;
		this.length=length;
	}

	@Override
	public double surface() {
		return 2*Math.PI*radius*radius + 2*Math.PI*radius*length;
	}

	@Override
	public double volume() {
		return Math.PI*radius*radius*length;
	}
}
