package a10_shape.be.kdg.oo.shape;


import a10_shape.be.kdg.oo.shape.geometry.*;

/**
 * Author: Jan de Rijke
 */
public class ShapeApp {
	public static void main(String[] args) {
		Shape[] shapes = {
			new Circle(5),
			new Rectangle(2, 3, 4, 5),
			new Square(10)};
		for (Shape s : shapes) {
			System.out.println(s);
		}
	}
}
