/**
 * 
 */
package test;

import java.util.ArrayList;

import product.ProductIntf;
import shoppingcart.ShoppingCartIntf;

/**
 * @author Osaide Ogbeifun
 *
 */
public class MockCart implements ShoppingCartIntf {

	/* (non-Javadoc)
	 * @see shoppingcart.ShoppingCartIntf#addProduct(product.ProductIntf)
	 */
	@Override
	public void addProduct(ProductIntf product) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see shoppingcart.ShoppingCartIntf#getProducts()
	 */
	@Override
	public ArrayList<ProductIntf> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

}
