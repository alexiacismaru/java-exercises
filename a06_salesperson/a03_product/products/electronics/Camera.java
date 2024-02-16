package a03_product.products.electronics;

import a03_product.products.Product;

/**
 * Author: Jan de Rijke
 */
public class Camera extends Product {
	private long pixels;

	public Camera(String code, String description, double price, int pixels){
		this.code=code;
		this.description=description;
		this.price=price;
		this.pixels = pixels;
	}

	public long getPixels() {
		return pixels;
	}

	@Override
	public double getVat() {
		return 0.21;
	}

		@Override
		public String toString() {
			return 		 String.format("Camera{ %s, pixels=%,d }",super.toString(),   getPixels());
	}
}
