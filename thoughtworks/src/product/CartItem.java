package product;

/**
 * @author Osaide Ogbeifun
 * 
 */
public class CartItem extends Product implements ProductIntf {
	private int quantity = 1; // default to one, assume they always need one.

	@Override
	public double getCartPrice() {
		return getQuantity() * getPrice();
	}

	@Override
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity
	 */
	@Override
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
