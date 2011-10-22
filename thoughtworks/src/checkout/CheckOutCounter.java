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

	private double totalTax, price = 0;
	CalculatorIntf calc = new SalesTaxCalc();

	/**
	 * @param cart
	 */
	public void checkOut(ShoppingCartIntf cart) {
		checkOutWithReceipt(cart);
		
	
	}

	/**
	 * @param cart
	 */
	protected void checkOutWithReceipt(ShoppingCartIntf cart) {
		ArrayList<ProductIntf> products = cart.getProducts();
		Printer printer = new Printer();
		double tax = 0; 
		System.out.println("Products");
		resetCounter();
		for (int i = 0; i < products.size(); i++) {
			 tax =  calc.calcTax(products.get(i)) ;
			addUpTax(tax);
			addUpPrice(products.get(i).getCartPrice());
			printer.printReceipt(products.get(i), tax);
		}
		printer.printTotal(getTax(), getTotalWithTax());
	}

	/**
	 * 
	 */
	private void resetCounter() {

		this.price =0;
		this.totalTax=0;
	}

	private double getTax() {
		return totalTax;
	}

	private double getTotalWithTax() {
		return (totalTax + price);
	}

	

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

}
