package Enteties;

public class Entity {
	private int health, attackDamage;
	public Entity(int health, int attackDamage){
		this.health = health;
		this.attackDamage = attackDamage;
	}
	
	public boolean takeDamage(int damage){
		this.health -= damage;
		if (this.health < 0){
			this.died();
			return false;
		}
		return true;
	}
	
	private void died() {
		// TODO Auto-generated method stub
		
	}

	public boolean giveDamage(Entity entetie){
		return entetie.takeDamage(this.attackDamage);
	}
}
