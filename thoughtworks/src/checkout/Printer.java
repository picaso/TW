/**
 * 
 */
package checkout;

import product.ProductIntf;

/**
 * @author Osaide Ogbeifun
 *
 */
public final class Printer {


	/**
	 * @param product
	 * @param tax 
	 */
	protected void printReceipt(ProductIntf product, double tax) {

		System.out.printf("%d %s: $%5.2f%n", product.getQuantity(),
				product.getName(),
				product.getCartPrice() + tax);

	}
	
	protected void printTotal(double tax, double total){
		System.out.printf("Tax: $%5.2f%n", tax);
		System.out.printf("Grand Total: $%5.2f%n \n", total);
		
	}
}
