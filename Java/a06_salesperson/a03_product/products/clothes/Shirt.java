package a03_product.products.clothes;

import a03_product.products.Product;

/**
 * Author: Jan de Rijke
 */
public class Shirt extends Product {
	private String gender;
	private String size;
	public Shirt(String code, String description, double price,String gender, String size){
		this.code=code;
		this.description=description;
		this.price=price;
		this.gender=gender;
		this.size = size;
	}

	public String getGender() {
		return gender;
	}

	public String getSize() {
		return size;
	}
	@Override
	public double getVat() {
		return 0.21;
	}
	@Override
	public String toString() {
		return String.format("Shirt{ %s, gender='%s' , size='%s'}",super.toString(), getGender(),getSize());
	}
}
