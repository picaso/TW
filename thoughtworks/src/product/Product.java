package product;

/**
 * @author Osaide Ogbeifun
 * 
 */
public abstract class Product {

	private String name = null;
	private double price = 0;

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

}
