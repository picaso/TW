/**
 * 
 */
package checkout;

import java.util.ArrayList;

import calculator.CalculatorIntf;
import calculator.SalesTaxCalc;
import product.ProductIntf;
import shoppingcart.ShoppingCartIntf;

/**
 * @author Osaide Ogbeifun
 * 
 */
public class CheckOutCounter implements CheckOutCounterIntf {

	CalculatorIntf calc = new SalesTaxCalc();
	private double totalTax, price = 0;

	/**
	 * @param price
	 */
	private void addUpPrice(double price) {
		this.price += price;

	}

	/**
	 * @param tax
	 */
	private void addUpTax(double tax) {
		this.totalTax += tax;

	}

	/**
	 * @param cart
	 */
	@Override
	public void checkOut(ShoppingCartIntf cart) {
		ArrayList<ProductIntf> products = cart.getProducts();
		Printer printer = new Printer();
		double tax = 0;
		System.out.println("Products");
		resetCounter();
		for (ProductIntf product : products) {
			tax = calc.calcTax(product);
			addUpTax(tax);
			addUpPrice(product.getCartPrice());
			printer.printReceipt(product, tax);
		}
		printer.printTotal(getTax(), getTotalWithTax());
		

	}

	private double getTax() {
		return totalTax;
	}

	private double getTotalWithTax() {
		return (totalTax + price);
	}

	/**
	 * 
	 */
	private void resetCounter() {

		this.price = 0;
		this.totalTax = 0;
	}

}
