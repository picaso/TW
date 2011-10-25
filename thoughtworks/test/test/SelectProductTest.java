/**
 * 
 */
package test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import store.SelectProduct;

/**
 * @author Osaide Ogbeifun 
 * 
 */
public class SelectProductTest {
	// File path to test files.
	private static File INPUT_DIR;;
	private static final ArrayList<String> PRODUCT_LIST = new ArrayList<String>();

	static {

		PRODUCT_LIST.add("1 book at 12.49");
		PRODUCT_LIST.add("1 music CD at 14.99");
		PRODUCT_LIST.add("1 chocolate bar at 0.85");
	}
	static {
		try {
			INPUT_DIR = new File(new File(".").getCanonicalFile(), "inputs");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Test method for
	 * {@link store.SelectProduct#selectproducts(java.lang.String)}.
	 * 
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	@Test
	public final void testSelectproducts() throws FileNotFoundException,
			IOException {

		
		ArrayList<String> productList = new ArrayList<String>();
		int index = 0;
		SelectProduct prd = new SelectProduct();
		productList = prd.selectproducts(INPUT_DIR.getPath()+ "/input1.txt");
		for (String product : productList) {
			assertEquals(product, PRODUCT_LIST.get(index));
			index++;

		}
		assertTrue("There should be 3 elements in input 1",
				productList.size() == 3);
	}

}