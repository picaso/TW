package product;


/**
 * @author Osaide Ogbeifun
 * 
 */
public  class ProductItem extends Product implements ProductIntf{
	private int quantity = 1; // default to one, assume they always need one.
	private boolean imported = false;

	public int getQuantity() {
		return quantity;
	}


	/**
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	/**
	 * @param imported
	 */
	public void setImported(String imported) {
		if (imported.toUpperCase() == "Y") {
			this.imported = true;
		} else {
			this.imported = false;
		}
	}

	public boolean isImported() {
		return imported;
	}

	public double getCartPrice() {
		return quantity * getPrice();
	}
}
