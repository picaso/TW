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

	public String getCategory();

	public String getName() ;

	public double getPrice() ;
	
	public int getQuantity() ;

	public boolean isImported() ;
	
	/**
	 * @param category
	 */
	public void setCategory(String category) ;
	/**
	 * @param imported
	 */
	public void setImported(String imported);

	/**
	 * @param name
	 */
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
