package a12_shape3D.shapes;

/**
 * Author: Jan de Rijke
 */
public class ShapeCatalog {
	private Shape3D[] shapes = new Shape3D[5];

	public ShapeCatalog() {
		fillCatalog();
	}

	private void fillCatalog() {
			shapes[0] = new Sphere();
			shapes[1] = new Cube(2.0);
			shapes[2] = new Cylinder("green", 2.0, 2.5);
			shapes[3] = new Cube("yellow", 3.0);
			shapes[4] = new Sphere("red", 2.0);
	}

	public void showShapes(){
		for (Shape3D shape:shapes
		     ) {
			shape.display();
		}
	}
}
