package a06_product.products;

/**
 * Author: Jan de Rijke
 */
public class Product {

	protected String code;
	protected String description;
	protected double price;

	public Product(String code, String description, double price){
		this.code=code;
		this.description=description;
		this.price=price;
	}

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
		return price * (1 + getVat());
	}

	@Override
	public String toString() {
		return String.format("code='%s', description='%s', price=%.2f", getCode(), getDescription(), getPrice());
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Product)) return false;
		Product other = (Product) obj;
		return (code == null ? other.code == null : code.equals(other.code))
			&& (description == null ? other.description == null : description.equals(other.description))
			&& price == other.price;
	}

	@Override
	public int hashCode() {
		return (code==null?0:code.hashCode() )
			^ (code==null?0:code.hashCode())
			^ (description==null?0:description.hashCode())
			^ (int)price*100;
	}
}
