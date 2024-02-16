package a12_shape3D.shapes;

/**
 * Author: Jan de Rijke
 */
public class Sphere extends Shape3D{

	double radius=1.0;

	public Sphere() {
	}

	public Sphere(String colour, double radius) {
		super(colour);
		this.radius = radius;
	}

	public Sphere(double radius) {
		this.radius = radius;
	}

	@Override
	public double surface() {
		return 4*Math.PI*radius*radius;
	}

	@Override
	public double volume() {
		return 4/3.0*Math.PI*Math.pow(radius,3);
	}
}
