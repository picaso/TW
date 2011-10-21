package calculator;
import java.util.*;

import product.ProductIntf;


/**
 * @author Osaide Ogbeifun
 *
 */
final class Category  {
	/**
	 * @param cat
	 * @return boolean
	 */
	protected boolean checkCategory(ProductIntf item) {
		String category[] = { "book", "food", "med" };

		// Convert Array to List
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(category));

		// Sort the list
		Collections.sort(list);

		// Search for element in list
		int index = Collections.binarySearch(list, item.getCategory().toLowerCase());
		if (index >= 0) {
			return true; //Found, so exempt
		} else {
			return false; //Not Found, no exempt
		}

	}

}
