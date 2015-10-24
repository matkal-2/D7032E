package Items;

public class Key extends Item{
	private int keyID;
	public Key(String name, String itemDescription, int keyID) {
		super(name, itemDescription);
		this.keyID = keyID;
	}
	public int getKeyID() {
		return this.keyID;
	}

}
