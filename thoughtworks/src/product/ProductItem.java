package product;

/**
 * @author Osaide Ogbeifun
 * 
 */
public class ProductItem extends Product implements ProductIntf {
	private int quantity = 1; // default to one, assume they always need one.

	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getCartPrice() {
		return getQuantity() * getPrice();
	}
}
