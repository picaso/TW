/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.Test;

import product.ProductIntf;
import product.ProductItem;

/**
 * @author Picaso
 * 
 */
public class ProductTest {
	private int quantity = 5;
	private int price = 4;

	/**
	 * Test method for {@link product.ProductItem#getQuantity()}.
	 */
	@Test
	public final void testGetQuantity() {

		ProductIntf prd = new ProductItem();
		prd.setQuantity(quantity);
		assertTrue(prd.getQuantity() == quantity);

	}

	/**
	 * Test method for {@link product.ProductItem#setQuantity(int)}.
	 */
	@Test
	public final void testSetQuantity() {

		ProductIntf prd = new ProductItem();
		prd.setQuantity(quantity);
		assertTrue(prd.getQuantity() == quantity);
	}

	/**
	 * Test method for {@link product.ProductItem#getCartPrice()}.
	 */
	@Test
	public final void testGetCartPrice() {

		ProductIntf prd = new ProductItem();
		prd.setQuantity(quantity);
		prd.setPrice(price);
		assertTrue(prd.getCartPrice() == price * quantity);
	}

}
