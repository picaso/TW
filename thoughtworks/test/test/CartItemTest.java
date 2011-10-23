/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.Test;

import product.ProductIntf;
import product.CartItem;

/**
 * @author Picaso
 * 
 */
public class CartItemTest {
	private int quantity = 5;
	private int price = 4;

	/**
	 * Test method for {@link product.CartItem#getQuantity()}.
	 */
	@Test
	public final void testGetQuantity() {

		ProductIntf prd = new CartItem();
		prd.setQuantity(quantity);
		assertTrue(prd.getQuantity() == quantity);

	}

	/**
	 * Test method for {@link product.CartItem#setQuantity(int)}.
	 */
	@Test
	public final void testSetQuantity() {

		ProductIntf prd = new CartItem();
		prd.setQuantity(quantity);
		assertTrue(prd.getQuantity() == quantity);
	}

	/**
	 * Test method for {@link product.CartItem#getCartPrice()}.
	 */
	@Test
	public final void testGetCartPrice() {

		ProductIntf prd = new CartItem();
		prd.setQuantity(quantity);
		prd.setPrice(price);
		assertTrue(prd.getCartPrice() == price * quantity);
	}

}
