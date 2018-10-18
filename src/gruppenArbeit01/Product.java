/*
* Gruppenarbeit 01: Warenkorb
* Klasse 1o
* Müller, Siro; Tommasi Nicola
*
*/
package gruppenArbeit01;


public class Product {

	private int id;
	private String itemName;
	private float price;
	private float mwst;
	private float mwstRate;
	private int quantity;
	
	public int getQuantity() {
		return quantity;
	}


	public Product(int id, String itemName, float price, float mwstRate) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.price = price;
		this.mwstRate = mwstRate;
		
		//calculate mwst
		this.mwst = this.price * this.mwstRate / 100f;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public float getMwst() {
		return mwst;
	}


	public void setMwst(float mwst) {
		this.mwst = mwst;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public float getMwstrate() {
		return mwstRate;
	}


	public void setMwstrate(float mwstRate) {
		this.mwstRate = mwstRate;
	}
	
	public static String formatfloats(float toBeFormatted) {
		String priceString = String.format("%.2f", toBeFormatted);
		return priceString;
	}

	
}
