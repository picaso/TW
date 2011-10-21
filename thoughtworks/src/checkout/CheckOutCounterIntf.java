/**
 * 
 */
package checkout;

import shoppingcart.ShoppingCartIntf;

/**
 * @author Osaide Ogbeifun
 * 
 */
public interface CheckOutCounterIntf {

	/**
	 * @param cart
	 */
	public void checkOut(ShoppingCartIntf cart);

	/**
	 * @param cart
	 */
	public void checkOutWithReceipt(ShoppingCartIntf cart);

}
