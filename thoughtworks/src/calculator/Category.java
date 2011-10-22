package calculator;

import java.util.*;

import product.ProductIntf;

/**
 * @author Osaide Ogbeifun
 * 
 */
public final class Category {

	private static final String IMPORTED_TOKEN = "imported";

	private static final List<String> EXEMPT_ITEMS_TOKENS = new ArrayList<String>();

	static {
		EXEMPT_ITEMS_TOKENS.add("book");
		EXEMPT_ITEMS_TOKENS.add("chocolate");
		EXEMPT_ITEMS_TOKENS.add("pills");
	}

	/**
	 * @param cat
	 * @return boolean
	 */
	protected boolean checkCategory(ProductIntf item) {

		String itemName = item.getName().toLowerCase();

		for (String exemptToken : EXEMPT_ITEMS_TOKENS) {
			if (itemName.toLowerCase().contains(exemptToken)) {
				return true;
			}

		}
		return false;
	}

	protected boolean checkImport(ProductIntf item) {
		// verify if the item is imported.
		String itemName = item.getName().toLowerCase();
		if (itemName.toLowerCase().contains(IMPORTED_TOKEN)) {
			return true;
		}
		return false;
	}

}
