/**
 * 
 */
package test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.util.ArrayList;

import org.junit.Test;

import product.CartItem;
import product.ProductIntf;
import shoppingcart.ShoppingCart;
import shoppingcart.ShoppingCartIntf;

/**
 * @author Osaide Ogbeifun
 * 
 */
public class ShoppingCartTest {

	private ShoppingCartIntf cart = new ShoppingCart();
	ArrayList<ProductIntf> products = new ArrayList<ProductIntf>();

	/**
	 * Test method for
	 * {@link shoppingcart.ShoppingCart#addProduct(product.ProductIntf)}.
	 */
	@Test
	public final void testAddProduct() {
		ProductIntf product = mock(CartItem.class);
		products = cart.getProducts();
		cart.addProduct(product);
		assertEquals("Expected", 1, products.size());
	}

	/**
	 * Test method for {@link shoppingcart.ShoppingCart#getProducts()}.
	 */
	@Test
	public final void testGetProducts() {
		testAddProduct();
		products = cart.getProducts();
		assertEquals("Expected", 1, products.size());

	}

}
