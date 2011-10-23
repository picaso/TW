package store;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import checkout.CheckOutCounter;
import checkout.CheckOutCounterIntf;

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

		System.out.println("Welcome to Jmart, please type 'Exit' to quit");
		System.out.printf("Hit Enter to continue. ");
		String input = location.readLine();

		do {
			try {
				System.out.println("Please Input path to product list: ");
				input = location.readLine();
				if (input.equalsIgnoreCase("Exit"))
					break;
				products = select.selectproducts(input);
				checkout.checkOut(shoppingcart.add(products));
				
			}

			catch (FileNotFoundException ex) {
				//System.out.println(ex.toString());
				System.err.println("File not found, Please try again");
			}

		} while (!input.equalsIgnoreCase("Exit"));
		System.out.printf("Good Bye!");
		System.exit(1);

	}

}
