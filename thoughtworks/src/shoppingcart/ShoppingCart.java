package shoppingcart;

import java.util.ArrayList;

import product.ProductIntf;



/**
 * @author Osaide Ogbeifun
 * 
 */
public class ShoppingCart  implements ShoppingCartIntf{

	private ArrayList<ProductIntf> products = new ArrayList<ProductIntf>();

	/**
	 * @param ProductItem
	 */
	public void addProduct(ProductIntf product) {
		// product = calc.calcTax(product);
		products.add(product);
	}

	public ArrayList<ProductIntf> getProducts() {
		return products;
	}
}
