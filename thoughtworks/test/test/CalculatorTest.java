/**
 * 
 */
package test;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import product.ProductIntf;

import calculator.CalculatorIntf;
import calculator.SalesTaxCalc;

/**
 * @author Picaso
 * 
 */
@RunWith(Parameterized.class)
public class CalculatorTest {

	private String name;
	private double price;
	private int qty;
	private double tax, get_tax;

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		Object[][] data = MockCartItems.MOCK_ITEM_LIST;
		return Arrays.asList(data);
	}

	

	public CalculatorTest(int qty, String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.tax = tax;
	}


	/**
	 * Test method for
	 * {@link calculator.SalesTaxCalc#calcTax(product.ProductIntf)}.
	 */
	@Test
	public final void testCalcTax() {
		CalculatorIntf calc = new SalesTaxCalc();
		ProductIntf product = new MockCartItems(){
			public String getName(){
				return name;
			}
			public int getQuantity(){
				return qty;
			}
			public double getPrice(){
				return price;
			}
			
		};
		
		get_tax = calc.calcTax(product);
		assertEquals(get_tax, tax, tax);
	}

}
