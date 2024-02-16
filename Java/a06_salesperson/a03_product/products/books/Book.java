package a03_product.products.books;

import a03_product.products.Product;

/**
 * Author: Jan de Rijke
 */
public class Book extends Product {
	private String title;
	private String author;
	public Book(String code, String description, double price, String title, String author){
		this.code=code;
		this.description=description;
		this.price=price;
		this.title =title;
		this.author=author;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return 		 String.format("Book{ %s, title='%s' , author='%s'}",super.toString(),  getTitle() ,getAuthor() );
	}

	@Override
	public double getVat() {
		return 0.06;
	}
}
