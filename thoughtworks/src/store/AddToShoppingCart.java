/**
 * 
 */
package store;

import java.util.ArrayList;
import java.util.Scanner;

import product.ProductIntf;
import product.ProductItem;
import shoppingcart.ShoppingCart;
import shoppingcart.ShoppingCartIntf;
import checkout.CheckOutCounter;
import checkout.CheckOutCounterIntf;

/**
 * @author Picaso
 * 
 */
public class AddToShoppingCart {
	CheckOutCounterIntf counter = new CheckOutCounter();
	ShoppingCartIntf cart = new ShoppingCart();

	public ShoppingCartIntf add(ArrayList<String> lineItemList) {

		for (String currentline : lineItemList) {
			scan(currentline);
		}
		return cart;
	}

	private void scan(String currentLine) {
		ProductIntf product = new ProductItem();
		Scanner scanner = new Scanner(currentLine);
		// scan the current for the quantity of an item line.
		int quantity = 0;
		if (scanner.hasNextInt()) {
			quantity = scanner.nextInt();

		} else {
			throw new IllegalStateException("The given itemLine '"
					+ currentLine + "' must start with an amount.");
		}

		// scan the tokens for the description of an item line, excluding the
		// token "at".
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

		// scan the price token an item line.
		double price = 0;
		if (scanner.hasNextFloat()) {
			price = scanner.nextFloat();			
		}
		product.setName(itemDescription);
		product.setPrice(price);
		product.setQuantity(quantity);
		cart.addProduct(product);
	}

}
