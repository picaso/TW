package store;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import checkout.CheckOutCounter;
import checkout.CheckOutCounterIntf;
import product.ProductIntf;
import product.ProductItem;
import shoppingcart.ShoppingCart;
import shoppingcart.ShoppingCartIntf;

/**
 * @author Osaide Ogbeifun
 * 
 */
public class Main {
	public static void main(String[] args) throws IOException {

		ArrayList<String> products = new ArrayList<String>();

		SelectProduct select = new SelectProduct();
		CheckOutCounterIntf checkout = new CheckOutCounter();

		AddToShoppingCart shoppingcart = new AddToShoppingCart();

		BufferedReader location = new BufferedReader(new InputStreamReader(
				System.in));

		System.out.printf("Please Input path to product list: ");
		products = select.selectproducts(location.readLine());
		checkout.checkOut(shoppingcart.add(products));

	}

}
