/**
 * 
 */
package test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import product.ProductIntf;
import shoppingcart.ShoppingCartIntf;
import calculator.CalculatorIntf;
import calculator.SalesTaxCalc;
import checkout.CheckOutCounter;
import checkout.CheckOutCounterIntf;

/**
 * @author Osaide Ogbeifun
 * 
 */
@RunWith(Parameterized.class)
public class CheckOutTest {

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		Object[][] data = MockCartItems.MOCK_ITEM_LIST;
		return Arrays.asList(data);
	}
	private String name;
	private double price;
	ArrayList<ProductIntf> products = new ArrayList<ProductIntf>();
	private int qty;

	private double tax;

	public CheckOutTest(int qty, String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.tax = tax;
	}

	/**
	 * Test method for
	 * {@link checkout.CheckOutCounter#checkOut(shoppingcart.ShoppingCartIntf)}.
	 */
	@Test
	public final void testCheckOut() {
		CalculatorIntf cal = mock(SalesTaxCalc.class);

		final ProductIntf product = new MockCartItems() {
			@Override
			public String getName() {
				return name;
			}

			@Override
			public double getPrice() {
				return price;
			}

			@Override
			public int getQuantity() {
				return qty;
			}

		};

		ShoppingCartIntf cart = new MockCart() {
			@Override
			public void addProduct(ProductIntf product) {
				products.add(product);
			}

			@Override
			public ArrayList<ProductIntf> getProducts() {
				return products;
			}

		};
		cart.addProduct(product);
		when(cal.calcTax(product)).thenReturn(tax);
		CheckOutCounterIntf checkout = new CheckOutCounter();

		checkout.checkOut(cart);

		assertEquals("Method salesTaxCalc not Called", true,
				cal.calcTax(product) == tax);

	}

}
