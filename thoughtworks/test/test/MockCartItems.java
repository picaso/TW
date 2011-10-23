/**
 * 
 */
package test;

import static org.mockito.Mockito.*;
import product.ProductIntf;

/**
 * @author Picaso
 * 
 */
public class MockCartItems {

	// A mock object to be passed to create a Cart Item
	public static Object[][] MOCK_ITEM_LIST = new Object[][] {
			{ 1, "book", 12.49d }, { 1, "Music CD", 14.99d },
			{ 1, "chocolate bar", 0.85d },
			{ 1, "imported box of chocolates", 10.00d },
			{ 1, "imported bottle of perfume", 47.50d },
			{ 1, "imported bottle of perfume", 27.99d },
			{ 1, "bottle of perfume", 18.99d },
			{ 1, "packet of headache pills", 9.75d },
			{ 1, "box of imported chocolates", 11.25d } };

	public ProductIntf generateMockProducts(int quantity, String name,
			float price) {

		ProductIntf product = mock(ProductIntf.class);
		product.setName(name);
		product.setPrice(price);
		product.setQuantity(quantity);
		return product;
	}

}