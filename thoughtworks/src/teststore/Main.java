package teststore;

import checkout.CheckOutCounter;
import checkout.CheckOutCounterIntf;
import product.ProductIntf;
import product.ProductItem;
import shoppingcart.ShoppingCart;
import shoppingcart.ShoppingCartIntf;

/**
 * @author Osaide Ogbeifun
 * 
 */
public class Main {
	public static void main(String[] args) {

		
		CheckOutCounterIntf counter = new CheckOutCounter();
		
		counter.checkOut(Customer1());
		counter.checkOut(Customer2());
		counter.checkOut(Customer3());

	}

	private static ShoppingCartIntf Customer1() {
		// Customer Walks in, Gets a Shopping Cart
		ShoppingCartIntf cart = new ShoppingCart();
		

		// Customer Gets Product
		/**
		 * Input 1: 1 book at 12.49 
		 * 1 music CD at 14.99 
		 * 1 chocolate bar at 0.85
		 */
		ProductIntf Book = new ProductItem();
		ProductIntf music = new ProductItem();
		ProductIntf chocolate = new ProductItem();

		// Properties of the product Book
		Book.setCategory("book");
		Book.setImported("n");
		Book.setName("Agile Programming");
		Book.setPrice(12.49);
		Book.setQuantity(1);

		music.setCategory("music");
		music.setImported("n");
		music.setName("Agile Music");
		music.setPrice(14.99);
		music.setQuantity(1);

		chocolate.setCategory("food");
		chocolate.setImported("n");
		chocolate.setName("Ruby Nuts");
		chocolate.setPrice(0.85);
		chocolate.setQuantity(1);

		// Cart can have multiple products
		cart.addProduct(Book);
		cart.addProduct(music);
		cart.addProduct(chocolate);
		
		return cart;

	}

	private static ShoppingCartIntf Customer2() {
		// Customer Walks in, Gets a Shopping Cart
		ShoppingCartIntf cart = new ShoppingCart();
		
		// Customer Gets Product
		/**
		 * 1 imported box of chocolates at 10.00 
		 * 1 imported bottle of perfume at 47.50
		 */
		ProductIntf perfume = new ProductItem();

		ProductIntf chocolate = new ProductItem();

		// Properties of the product Book
		chocolate.setCategory("food");
		chocolate.setImported("Y");
		chocolate.setName("Rails Nut");
		chocolate.setPrice(10.00);
		chocolate.setQuantity(1);

		perfume.setCategory("perfume");
		perfume.setImported("Y");
		perfume.setName("Fresh Rails");
		perfume.setPrice(47.50);
		perfume.setQuantity(1);

		// Cart can have multiple products
		cart.addProduct(chocolate);
		cart.addProduct(perfume);

		return cart;
	}

	private static ShoppingCartIntf Customer3() {
		// Customer Walks in, Gets a Shopping Cart
		ShoppingCartIntf cart = new ShoppingCart();
		
		// Customer Gets Product
		/**
		 * 1 imported bottle of perfume at 27.99 
		 * 1 bottle of perfume at 18.99 
		 * 1 packet of headache pills at 9.75 
		 * 1 box of imported chocolates at 11.25
		 */
		ProductIntf perfume = new ProductItem();
		ProductIntf imperfume = new ProductItem();
		ProductIntf pills = new ProductItem();
		ProductIntf chocolate = new ProductItem();

		perfume.setCategory("perfume");
		perfume.setImported("n");
		perfume.setName("Local Fresh Rails");
		perfume.setPrice(18.99);
		perfume.setQuantity(1);

		imperfume.setCategory("perfume");
		imperfume.setImported("Y");
		imperfume.setName("Fresh Rails");
		imperfume.setPrice(27.99);
		imperfume.setQuantity(1);

		pills.setCategory("med");
		pills.setImported("n");
		pills.setName("Pills");
		pills.setPrice(9.75);
		pills.setQuantity(1);

		chocolate.setCategory("food");
		chocolate.setImported("Y");
		chocolate.setName("Rails Nut");
		chocolate.setPrice(11.25);
		chocolate.setQuantity(1);

		// Cart can have multiple products
		cart.addProduct(imperfume);
		cart.addProduct(perfume);
		cart.addProduct(pills);
		cart.addProduct(chocolate);

		return cart;
	}
}
