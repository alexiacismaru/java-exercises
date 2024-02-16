package a12_shape3D.shapes;

import static java.lang.Math.pow;

/**
 * Author: Jan de Rijke
 */
public class Cube extends Shape3D{

	double edge =1.0;

	public Cube() {
	}

	public Cube(String colour, double edge) {
		super(colour);
		this.edge = edge;
	}

	public Cube(double edge) {
		this.edge = edge;
	}

	@Override
	public double surface() {
		return 6* edge * edge;
	}

	@Override
	public double volume() {
		return pow(edge,3);
	}
}
