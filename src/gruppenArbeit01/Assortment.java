/*
* Gruppenarbeit 01: Warenkorb
* Klasse 1o
* Müller, Siro; Tommasi Nicola
*
*/

package gruppenArbeit01;

public class Assortment extends Collection {

	public Assortment(String currency) {
		super(currency);
}
	
	public void showProducts() {
		System.out.println("------------------------");
		System.out.println("Verfügbare Artikel:" + "\n");
		for (Product item : collection) {
			System.out.println(item.getId() + ")\t" + item.getItemName() + "\t" + "\t" + Product.formatfloats(item.getPrice()) + " " + this.currency
					+ " (" + Product.formatfloats(item.getMwst()) + " " + this.currency + ")");
		}
		System.out.println("------------------------");
	}

}
