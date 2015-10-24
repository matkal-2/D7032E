package Items;

public class Weapon extends Item{
	private String weaponType;
	private int weaponDamage;

	public Weapon(String itemName, String itemDescription, String weaponType, int weaponDamage) {
		super(itemName, itemDescription);
		this.weaponType = weaponType;
		this.weaponDamage = weaponDamage;
	}
	
	public int getWeaponDamage(){
		return this.weaponDamage;
	}

}
