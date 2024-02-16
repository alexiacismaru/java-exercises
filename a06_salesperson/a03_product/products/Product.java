package a03_product.products;

/**
 * Author: Jan de Rijke
 */
public class Product {

	protected String code;
	protected String description;
	protected double price;

	public String getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

	public double getVat() {
		return 0.21;
	}

	public double getPrice() {
		return price * (1+getVat());
	}

	@Override
	public String toString() {
		return String.format("code='%s', description='%s', price=%.2f",getCode(),getDescription(),getPrice());
	}
}
