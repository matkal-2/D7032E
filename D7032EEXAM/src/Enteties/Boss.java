package Enteties;

import HomeExam.The_Game;

public class Boss extends Monster{

	public Boss(int health, int attackDamage, String name, String taunt) {
		super(health, attackDamage, name, taunt);
	}
	
	@Override
	public void defeated(){
		The_Game.move(The_Game.previousRoom);
	}



}
