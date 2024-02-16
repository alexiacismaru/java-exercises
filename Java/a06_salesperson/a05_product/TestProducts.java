package a05_product;

import a03_product.products.clothes.Shirt;
import a03_product.products.electronics.Camera;
import a05_product.products.books.Book;

/**
 * Author: Jan de Rijke
 */
public class TestProducts {
	public static void main(String[] args) {
		Book book1 = new Book("455","Booker prize winner",26.22,"Bring up the bodies","Hillary Mantel");
		System.out.println(book1);
		System.out.println(new Camera("ZX20","Canon 500",265.22,2_000_000));
		System.out.println(new Shirt("LAC5688","Antwrp",36.99,"M","L"));
		Book book2 = new Book("455","Booker prize winner",26.22,"Bring up the bodies","Hillary Mantel");
		Book book3 = new Book("455","Booker prize loser",26.22,"Bring up the bodies","Hillary Mantel");
		System.out.println("Books 1 and 2 are " + ((book1.equals(book2))?"the same.":"different."));
		System.out.println("Books 1 and 3 are " + ((book1.equals(book3))?"the same.":"different."));
		System.out.println("Hashcode book1: "+book1.hashCode());
		System.out.println("Hashcode book2: "+book2.hashCode());
		System.out.println("Hashcode book3: "+book3.hashCode());
	}
}
