/**
 * 
 */
package test;

import static org.junit.Assert.*;


import org.junit.Test;

import product.CartItem;
import product.ProductIntf;

import shoppingcart.ShoppingCart;
import shoppingcart.ShoppingCartIntf;
import static org.mockito.Mockito.*;

import checkout.CheckOutCounter;
import checkout.CheckOutCounterIntf;

import calculator.CalculatorIntf;
import calculator.SalesTaxCalc;

/**
 * @author Picaso
 *
 */
public class CheckOutTest {


	/**
	 * Test method for {@link checkout.CheckOutCounter#checkOut(shoppingcart.ShoppingCartIntf)}.
	 */
	@Test
	public final void testCheckOut() {
		CalculatorIntf cal = mock(SalesTaxCalc.class);
		ShoppingCartIntf cart = mock(ShoppingCart.class);
		ProductIntf prd = mock(CartItem.class);
		CheckOutCounterIntf checkout =new CheckOutCounter();
		checkout.checkOut(cart);
		
		verify(cal).calcTax(eq(prd));
		
	}

	
}
