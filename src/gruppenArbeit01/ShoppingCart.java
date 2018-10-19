/*
* Gruppenarbeit 01: Warenkorb
* Klasse 1o
* M�ller, Siro; Tommasi Nicola
*
*/

package gruppenArbeit01;

public class ShoppingCart extends Collection {

	public ShoppingCart(String currency) {
		super(currency);



	}

	public void addItem(Product assortmentItem, int quantity) {
		assortmentItem.setQuantity(quantity);
		super.addProduct(assortmentItem);
	}

	public void updateItem(Product assortmentItem, Product shoppingCartItem, int quantity) {
		assortmentItem.setQuantity(shoppingCartItem.getQuantity() + quantity);
		assortmentItem.setPrice(shoppingCartItem.getPrice() + assortmentItem.getPrice());
		collection.set(assortmentItem.getId() - 1, assortmentItem);
	}

	public void showContent() {
		System.out.println("------------------------------------------------------------");
		float gesPrice = 0f;
		float gesMwst = 0f;
		float gesMwstRate = 0f;
		if (super.collection.size() > 0) {
			System.out.println("Ihr Warenkorb:");
			for (Product item : collection) {
				float price = item.getPrice() * item.getQuantity();
				float mwst = item.getMwst() * item.getQuantity();
				//Sum for each product
				System.out.println(item.getQuantity() + "\t" + item.getItemName() + "\t" + Product.formatfloats(item.getPrice()) + " "
						+ super.currency + "\t" + Product.formatfloats(price) + " " + super.currency);
				gesPrice += price;
				gesMwst += mwst;
				gesMwstRate += item.getMwstrate();
			}
			//summ overall
			System.out.println("\n" + "Der Gesamtpreis von " + Product.formatfloats(gesPrice) + " CHF" + " enth�lt " + Product.formatfloats(gesMwst) + " "
					+ super.currency + " MwSt (" + gesMwstRate + " %)");
		} else {

			System.out.println("Ihr Warenkorb ist leer.");
		}

	}

}
