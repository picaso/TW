/**
 * 
 */
package checkout;

import product.ProductIntf;

/**
 * @author Osaide Ogbeifun
 *
 */
final class Printer {
	
	/**
	 * @param product
	 * @return printLabel
	 */
	private String labelProduct(ProductIntf product) {
		if (product.isImported()) {
			return "Imported " + product.getName();
		}
		return product.getName();

	}

	/**
	 * @param product
	 * @param tax 
	 */
	protected void printReceipt(ProductIntf product, double tax) {

		System.out.printf("%d %s: $%5.2f%n", product.getQuantity(),
				labelProduct(product),
				product.getCartPrice() + tax);

	}
	
	protected void printTotal(double tax, double total){
		System.out.printf("Tax: $%5.2f%n", tax);
		System.out.printf("Grand Total: $%5.2f%n \n", total);
		
	}
}
