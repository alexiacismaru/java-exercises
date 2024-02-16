package a03_product;

import a03_product.products.books.Book;
import a03_product.products.clothes.Shirt;
import a03_product.products.electronics.Camera;

/**
 * Author: Jan de Rijke
 */
public class TestProducts {
	public static void main(String[] args) {
		System.out.println(new Book("455","Booker prize winner",26.22,"Bring up the bodies","Hillary Mantel"));
		System.out.println(new Camera("ZX20","Canon 500",265.22,2_000_000));
		System.out.println(new Shirt("LAC5688","Antwrp",36.99,"M","L"));
	}
}
