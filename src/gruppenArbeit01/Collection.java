/*
* Gruppenarbeit 01: Warenkorb
* Klasse 1o
* Müller, Siro; Tommasi Nicola
*
*/
package gruppenArbeit01;

import java.util.ArrayList;

public class Collection {
	
	// product list
	 protected ArrayList<Product> collection = new ArrayList<Product>();
	// same currency for all products
	 protected String currency;

	public Collection(String currency) {
		super();
		this.currency = currency;
	}

	public void addProduct(Product item) {
		collection.add(item);
	}
	
	public Product getProduct(int id) {
		try {
			Product item = collection.get(id-1);
			 return item;
		} catch (Exception e) {
			return null;
		}
	}
	
	public static int parseToInt(String input) {
		try {
			int parsedInt = Integer.parseInt(input);
			return parsedInt;
		} catch (NumberFormatException e) {
			System.out.println("Eingabe ist kein Integer");
			return -1;
		}
		
	}
	
}
