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

		

		SelectProduct select = new SelectProduct();
		CheckOutCounterIntf checkout = new CheckOutCounter();

		BufferedReader location = new BufferedReader(new InputStreamReader(
				System.in));

		System.out
				.println("Welcome to Jmart, please Hit Enter for more instructions");

		String input = location.readLine();
		System.out
				.println("Enter the file path to the input file \"C:\\Folder\\input1.txt\" or \nfor *nix/mac users: \"/folder/input.txt\"\n  ");

		System.out.println("To exit, just type \"Exit\"\n");

		do {
			try {
				System.out.println("\nPlease Input path to product list or type \"Exit\" to quit: ");
				input = location.readLine();
				if (input.equalsIgnoreCase("Exit"))
					break;
				ArrayList<String> products = new ArrayList<String>();
				AddToShoppingCart shoppingcart = new AddToShoppingCart();
				products = select.selectproducts(input);
				checkout.checkOut(shoppingcart.add(products));
				products = null;
			}

			catch (FileNotFoundException ex) {
				
				System.err.println("File not found, Please try again");
			}

		} while (!input.equalsIgnoreCase("Exit"));
		System.out.println("Good Bye!");
		System.exit(1);

	}

}
