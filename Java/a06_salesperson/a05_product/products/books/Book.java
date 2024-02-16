package a05_product.products.books;

import a05_product.products.Product;

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

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj) || !(obj instanceof Book)) return false;
		Book other = (Book) obj;
		return (title == null ? other.title == null : title.equals(other.title))
			&& (author == null ? other.author == null : author.equals(other.author));
	}

	@Override
	public int hashCode() {
		return super.hashCode() ^ (title==null?0:title.hashCode() )
			^ (author==null?0:author.hashCode());
	}
}
