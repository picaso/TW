/**
 * 
 */
package product;

/**
 * @author Osaide Ogbeifun
 *
 */
public interface ProductIntf {
	

	public double getCartPrice();

	public String getName() ;

	public double getPrice() ;
	
	public int getQuantity() ;

	public void setName(String name) ;

	/**
	 * @param price
	 */
	public void setPrice(double price) ;

	/**
	 * @param quantity
	 */
	public void setQuantity(int quantity);

}
