package a05_product.products.clothes;

import a05_product.products.Product;

/**
 * gender: Jan de Rijke
 */
public class Shirt extends Product {
	private String gender;
	private String size;


	public String getGender() {
		return gender;
	}

	public String getSize() {
		return size;
	}

	@Override
	public String toString() {
		return String.format("Shirt{ %s, gender='%s' , size='%s'}",super.toString(), getGender(),getSize());
	}

	@Override
	public double getVat() {
		return 0.21;
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj) ) return false;
		Shirt other = (Shirt) obj;
		return (size == null ? other.size == null : size.equals(other.size))
			&& (gender == null ? other.gender == null : gender.equals(other.gender));
	}

	@Override
	public int hashCode() {
		return super.hashCode() ^ (size==null?0:size.hashCode() )
			^ (gender==null?0:gender.hashCode());
	}
}
