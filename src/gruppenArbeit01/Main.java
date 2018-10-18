/*
* Gruppenarbeit 01: Warenkorb
* Klasse 1o
* Müller, Siro; Tommasi Nicola
*
*/


//TODO: MWST Berechnung überprüfen (stimmt nicht)
//TODO: Kommentare
//TODO: Stringausgabe mit Tabulatoren

package gruppenArbeit01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// create assortment
		Assortment assortment = new Assortment("CHF");

		// create products for assortment
		Product pr1 = new Product(1, "Käsekuchen", 11.10f, 1.0f);
		Product pr2 = new Product(2, "Nusstorte", 12.90f, 2.0f);
		Product pr3 = new Product(3, "Whiskey Old", 45.90f, 10.0f);

		// add products to assortment
		assortment.addProduct(pr1);
		assortment.addProduct(pr2);
		assortment.addProduct(pr3);

		// create shoppingCart
		ShoppingCart shoppingCart = new ShoppingCart("CHF");

		// initialize scanner and listen
		Scanner scanner = new Scanner(System.in);
		while (true) {
			// int quantityInt = 0;
			// int idInt = 0;

			shoppingCart.showContent();
			assortment.showProducts();

			// id (which product)
			System.out.println("\n" + "Welcher Artikel soll dem Warenkorb hinzugefügt werden (1,2,3 oder q für Ende)");
			String id = scanner.next();
			if (id.equals("q"))
				break;

			// select product from assortment
			int idInt = Collection.parseToInt(id);
			if (idInt == -1)
				break;
			Product assortmentItem = assortment.getProduct(idInt);

			// quantity (how much)
			System.out.println("Wie viele Artikel " + assortmentItem.getItemName()
					+ " sollen hinzugefügt werden: (Zahl oder a für Abbrechen)");
			String quantity = scanner.next();
			if (quantity.equals("a"))
				break;

			// parse quantity to integer
			int quantityInt = Collection.parseToInt(quantity);
			if (quantityInt == -1)
				break;

			// check if already exists in shopping cart
			Product shoppingCartItem = shoppingCart.getProduct(idInt);
			if (shoppingCartItem != null) {
				// update item in shopping cart
				shoppingCart.updateItem(assortmentItem, shoppingCartItem, quantityInt);
			} else {
				// add item to shopping cart
				shoppingCart.addItem(assortmentItem, quantityInt);
			}
		}

		System.out.println("Ende");
		scanner.close();

	}

}
