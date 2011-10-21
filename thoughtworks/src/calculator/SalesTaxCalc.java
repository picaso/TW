package calculator;

import product.ProductIntf;

/**
 * @author Osaide Ogbeifun
 *
 */
public  class SalesTaxCalc implements CalculatorIntf{

	
	/**
	 * Constructor to pass object
	 * @param product
	 * @return
	 */
	public double calcTax(ProductIntf product) {
		double tax =0;
		boolean isExempt = false;
		
		Category category = new Category();
		isExempt=category.checkCategory(product);
		
		int qty =product.getQuantity();

		if (product.isImported()) {
			tax=(qty*importTax(product.getCartPrice()));
		}
		if (!isExempt) {
			tax=(qty*genSalesTax(product.getCartPrice()));
		}
		if (product.isImported() && !isExempt) {
			tax=(qty*importAndGenTax(product.getCartPrice()));
		}
		return converter(tax);
	}
	

	/**
	 * @param price
	 * @return
	 */
	private double converter(double price) {
		return Math.ceil(price / 0.05) * 0.05;
	}

	/**
	 * @param price
	 * @return
	 */
	private double genSalesTax(double price) {
		double TaxInd = 0.1;
		return (price * TaxInd);

	}

	/**
	 * @param price
	 * @return
	 */
	private double importAndGenTax(double price) {
		double TaxInd = 0.15;
		return (price * TaxInd);

	}

	/**
	 * @param price
	 * @return
	 */
	private double importTax(double price) {
		double TaxInd = 0.05;
		return (price * TaxInd);

	}

}
