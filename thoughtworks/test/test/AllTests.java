/**
 * 
 */
package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author Osaide Ogbeifun
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ CalculatorTest.class, CartItemTest.class, CheckOutTest.class,
		SelectProductTest.class, ShoppingCartTest.class })
public class AllTests {

}
