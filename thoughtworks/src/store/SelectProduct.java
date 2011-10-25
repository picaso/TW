package store;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Osaide Ogbeifun
 * 
 */
public class SelectProduct {

	private BufferedReader bufferedReader;
	private FileReader fileReader;

	public ArrayList<String> selectproducts(String filePath)
			throws IOException, FileNotFoundException {

		ArrayList<String> lineItems = new ArrayList<String>();

		fileReader = new FileReader(filePath);

		bufferedReader = new BufferedReader(fileReader);
		String currentLine = null;
		while ((currentLine = bufferedReader.readLine()) != null) {
			lineItems.add(currentLine);
		}

		return lineItems;

	}

}
