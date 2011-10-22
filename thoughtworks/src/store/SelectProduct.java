package store;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SelectProduct {

	private FileReader fileReader;
	private BufferedReader bufferedReader;
	
	



	public ArrayList<String>  selectproducts(String filePath) throws IOException {		
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
