/**
 * 
 */
package test;

import product.ProductIntf;

/**
 * @author  Osaide Ogbeifun
 * 
 */
public class MockCartItems implements ProductIntf{

	// A mock object to be passed to create a Cart Item
	public static Object[][] MOCK_ITEM_LIST = new Object[][] {
			{ 1, "book", 12.49d, 12.49d  }, { 1, "Music CD", 14.99d, 16.49d },
			{ 1, "chocolate bar", 0.85d, 0.85d },
			{ 1, "imported box of chocolates", 10.00d,10.50d },
			{ 1, "imported bottle of perfume", 47.50d,  54.65d },
			{ 1, "imported bottle of perfume", 27.99d, 32.19d },
			{ 1, "bottle of perfume", 18.99d, 20.89d },
			{ 1, "packet of headache pills", 9.75d, 9.75d  },
			{ 1, "box of imported chocolates", 11.25d, 11.85d } };



	/* (non-Javadoc)
	 * @see product.ProductIntf#getCartPrice()
	 */
	@Override
	public double getCartPrice() {
		
		return 0;
	}

	/* (non-Javadoc)
	 * @see product.ProductIntf#getName()
	 */
	@Override
	public String getName() {
		
		return null;
	}

	/* (non-Javadoc)
	 * @see product.ProductIntf#getPrice()
	 */
	@Override
	public double getPrice() {
		
		return 0;
	}

	/* (non-Javadoc)
	 * @see product.ProductIntf#getQuantity()
	 */
	@Override
	public int getQuantity() {
		
		return 0;
	}

	/* (non-Javadoc)
	 * @see product.ProductIntf#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		
		
	}

	/* (non-Javadoc)
	 * @see product.ProductIntf#setPrice(double)
	 */
	@Override
	public void setPrice(double price) {
		
		
	}

	/* (non-Javadoc)
	 * @see product.ProductIntf#setQuantity(int)
	 */
	@Override
	public void setQuantity(int quantity) {
		
		
	}

	
}