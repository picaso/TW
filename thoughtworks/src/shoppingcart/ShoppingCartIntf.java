/**
 * 
 */
package shoppingcart;

import java.util.ArrayList;

import product.ProductIntf;


/**
 * @author Osaide Ogbeifun
 *
 */
public interface ShoppingCartIntf {
	public void addProduct(ProductIntf product);
	public ArrayList<ProductIntf> getProducts();

	
}
