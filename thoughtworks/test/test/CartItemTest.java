/**
 * 
 */
package test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import product.ProductIntf;
import product.CartItem;

/**
 * @author Osaide Ogbeifun
 * 
 */
@RunWith(Parameterized.class)
public class CartItemTest {
	
	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		Object[][] data = MockCartItems.MOCK_ITEM_LIST;
		return Arrays.asList(data);
	}
	private double cart_price;
	private double price;

	private int qty;

	

	public CartItemTest(int qty, String name, double price, double tax) {
		
		this.price = price;
		this.qty = qty;
		this.cart_price =price*qty;
		
	}

	/**
	 * Test method for {@link product.CartItem#getCartPrice()}.
	 */
	@Test
	public final void testGetCartPrice() {

		ProductIntf prd = new CartItem();
		prd.setQuantity(qty);
		prd.setPrice(price);
		assertTrue(prd.getCartPrice() == cart_price);
	}

	/**
	 * Test method for {@link product.CartItem#getQuantity()}.
	 */
	@Test
	public final void testGetQuantity() {

		ProductIntf prd = new CartItem();
		prd.setQuantity(qty);
		assertTrue(prd.getQuantity() == qty);

	}

	/**
	 * Test method for {@link product.CartItem#setQuantity(int)}.
	 */
	@Test
	public final void testSetQuantity() {

		ProductIntf prd = new CartItem();
		prd.setQuantity(qty);
		assertTrue(prd.getQuantity() == qty);
	}

}
