package Items;

public class Item {
	private String itemDescription;
	private String itemName;

	public Item(String name, String itemDescription) {
		this.itemDescription = itemDescription;
		this.itemName = name;
	}

	public String getItemDescription() {
		// TODO Auto-generated method stub
		return this.itemDescription;
	}

	public String getName() {
		return this.itemName;
	}
}