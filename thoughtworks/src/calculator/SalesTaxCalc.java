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
	@Override
	public double calcTax(ProductIntf product) {
		double tax =0;
		boolean isExempt, isImport = false;
		
		Category category = new Category();
		isExempt=category.checkCategory(product);
		isImport=category.checkImport(product);
		
		int qty =product.getQuantity();

		if (isImport) {
			tax=(qty*importTax(product.getCartPrice()));
		}
		if (!isExempt) {
			tax=(qty*genSalesTax(product.getCartPrice()));
		}
		if (isImport && !isExempt) {
			tax=(qty*importAndGenTax(product.getCartPrice()));
		}
		return converter(tax);
		
	}
	

	/**
	 * @param price
	 * @return price
	 */
	private double converter(double price) {
		return Math.ceil(price / 0.05) * 0.05;
	}

	/**
	 * @param price
	 * @return tax
	 */
	private double genSalesTax(double price) {
		double TaxInd = 0.1;
		return (price * TaxInd);

	}

	/**
	 * @param price
	 * @return tax
	 */
	private double importAndGenTax(double price) {
		double TaxInd = 0.15;
		return (price * TaxInd);

	}

	/**
	 * @param price
	 * @return tax
	 */
	private double importTax(double price) {
		double TaxInd = 0.05;
		return (price * TaxInd);

	}

}
