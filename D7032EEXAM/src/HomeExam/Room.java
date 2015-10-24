package HomeExam;

import Enteties.Entity;

public class Room {
	private Room roomToTheWest, roomToTheEast, roomToTheNorth, roomToTheSouth;
	private int lockWest, lockEast, lockNorth, lockSouth;
	private Entity monster;
	private Item item;
	public String roomMessage;
	
	public Room(Entity monster, Item item, String roomMessage){
		this.item = item;
		this.monster = monster;
		this.roomMessage = roomMessage;
		this.roomToTheWest = this.roomToTheEast = this.roomToTheNorth = this.roomToTheSouth = null;
		this.lockWest = this.lockEast = this.lockNorth = this.lockSouth = 0;
	}
	
	public boolean connectRoom(int dir, Room room){
		switch(dir){
		case 0:
			this.roomToTheWest = room;
			return true;
		case 1:
			this.roomToTheNorth = room;
			return true;
		case 2:
			this.roomToTheEast = room;
			return true;
		case 3:
			this.roomToTheSouth = room;
			return true;
		default:
			return false;
		}
	}
	
	public Room getRoom(int dir){
		switch(dir){
		case 0:
			return this.roomToTheWest;
		case 1:
			return this.roomToTheNorth;
		case 2:
			return this.roomToTheEast;
		case 3:
			return this.roomToTheSouth;
		default:
			return null;
		}
	}

	public void playerPresent() throws Exception {
		String choice = UserInput.userInput();
		switch(choice){
		case "w":
			if(this.roomToTheWest != null && lockWest == 0)The_Game.move(this.roomToTheWest);
			break;
		case "n":
			if(this.roomToTheNorth != null && lockNorth == 0)The_Game.move(this.roomToTheNorth);
			break;
		case "e":
			if(this.roomToTheEast != null && lockEast == 0)The_Game.move(this.roomToTheEast);
			break;
		case "s":
			if(this.roomToTheSouth != null && lockSouth == 0)The_Game.move(this.roomToTheSouth);
			break;
		default:
			The_Game.failedAction = true;
			GUI.drawGUI();
			break;
		}
			
	}
}
