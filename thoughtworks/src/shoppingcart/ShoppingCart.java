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
	@Override
	public void addProduct(ProductIntf product) {
		// product = calc.calcTax(product);
		products.add(product);
	}

	@Override
	public ArrayList<ProductIntf> getProducts() {
		return products;
	}
}
