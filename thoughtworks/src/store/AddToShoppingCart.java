/**
 * 
 */
package store;

import java.util.ArrayList;
import java.util.Scanner;

import product.ProductIntf;
import product.CartItem;
import shoppingcart.ShoppingCart;
import shoppingcart.ShoppingCartIntf;

/**
 * @author Osaide Ogbeifun
 * 
 */
public class AddToShoppingCart {

	ShoppingCartIntf cart = new ShoppingCart();

	public ShoppingCartIntf add(ArrayList<String> lineItemList) {

		for (String currentline : lineItemList) {
			scan(currentline);
		}
		return cart;
	}

	private void scan(String currentLine) {
		try {
			ProductIntf product = new CartItem();
			Scanner scanner = new Scanner(currentLine);
			// scan the current for the quantity of an item line.
			int quantity = 0;
			if (scanner.hasNextInt()) {
				quantity = scanner.nextInt();

			} else {
				throw new IllegalStateException("The given itemLine '"
						+ currentLine + "' must have an integer at the index position");
			}

			// scan the currentline for description, breaking @ at
			StringBuilder builder = new StringBuilder();
			while (scanner.hasNext()) {
				String descriptionToken = scanner.next();
				if (descriptionToken.equals("at")) {
					break;
				}
				builder.append(descriptionToken);
				builder.append(" ");
			}
			String itemDescription = builder.toString().trim();

			// Check for price
			double price = 0;
			if (scanner.hasNextFloat()) {
				price = scanner.nextFloat();
			} else {
				throw new IllegalStateException("The given itemLine '"
						+ currentLine + "' should end with a prce 00.00.");
			}
			product.setName(itemDescription);
			product.setPrice(price);
			product.setQuantity(quantity);
			cart.addProduct(product);
		}

		catch (IllegalStateException objA) {
			System.out.println("caught:" + objA);
		}
	}
}
