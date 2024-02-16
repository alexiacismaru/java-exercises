package a12_shape3D.shapes;

/**
 * Author: Jan de Rijke
 */
public abstract class Shape3D {
		private String colour="black";


		public Shape3D(String colour) {
			this.colour = colour;
		}

		/**
		 * Default constructor setting colour black.
		 */
		public Shape3D() {
		}


		public String getColour() {
			return colour;
		}


		public abstract double surface() ;
		public abstract  double volume() ;


		public void display() {
			System.out.format("colour: %-5s surface: %5.3f volume: %5.3f\n", colour, surface(), volume());
		}
}
