package a05_product.products.electronics;

import a05_product.products.Product;

/**
 * Author: Jan de Rijke
 */
public class Camera extends Product {
	private long pixels;



	public long getPixels() {
		return pixels;
	}


	@Override
	public String toString() {
		return String.format("Camera{ %s, pixels=%,d }", super.toString(), getPixels());
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj) || !(obj instanceof Camera)) return false;
		Camera other = (Camera) obj;
		return pixels == other.pixels ;
	}

	@Override
	public double getVat() {
		return 0.21;
	}

	@Override
	public int hashCode() {
		return super.hashCode() ^ (int) pixels;
	}
}
