package HomeExam;

import java.util.ArrayList;

public class Level {
	ArrayList<Room> rooms = new ArrayList<Room>();
	public Level() {
		createRooms();
		connectRooms();
	}
	
	private void createRooms() {
		String message;
		
		// Making room 0
		message = "Welcome " + The_Game.playerName + " to your treasure hunt. Beware of the dragon!\n"
				+ "You are standing outside a cave. There is a smell of sulfur coming from the opening\n"
				+ "The cave opening is to your east. Write \"e\" and press [Enter] to enter the cave";
		rooms.add(new Room(null,null,message));
		
		// Making room 1
		message = "The room is lit by a few candles sitting on a table in front of you. \n "
				+ "You can go north [n] and south [s]";
		
		rooms.add(new Room(null,null,message));
		
		// Making room 2
		message = "You see a dead body on the floor. You can go [s] and [e]";
		
		rooms.add(new Room(null,null,message));
		
		// Making room 3
		message = "You see an exit to the east [e], a room to the west [w] and a room to the south [s]";
		
		rooms.add(new Room(null,null,message));
		
		// Making room 4
		message = "You see a locked door to the east, \n" + 
			"a way to the north [n], and a way to the west [w]";

		rooms.add(new Room(null,null,message));
		
		// Making room 5
		message = "You see a key laying on the floor.\n"+ 
				"You can pick up the key [p], and go [w] or [e]";
		
		rooms.add(new Room(null,null,message));
		
		// Making room 6
		message = "You drag the gold out the way you came from";
		
		rooms.add(new Room(null,null,message));
	}
	
	private void connectRooms() {
		// Enter cave from outside
		rooms.get(0).connectRoom(2, rooms.get(1));
		
		// room 1, north to room 2 or south to room 5
		rooms.get(1).connectRoom(1, rooms.get(2));
		rooms.get(1).connectRoom(3, rooms.get(5));
		
		// room 2, south to room 1 or east to room 3
		rooms.get(2).connectRoom(3, rooms.get(1));
		rooms.get(2).connectRoom(2, rooms.get(3));
		
		// room 3, west to room 2, or south to room 4
		rooms.get(3).connectRoom(0, rooms.get(2));
		rooms.get(3).connectRoom(3, rooms.get(4));
		
		// room 4, west to room 5 or north to room 3 or east to room 6
		rooms.get(4).connectRoom(0, rooms.get(5));
		rooms.get(4).connectRoom(1, rooms.get(3));
		rooms.get(4).connectRoom(2, rooms.get(6));
		
		// room 5, west to room 1 or east to room 4
		rooms.get(5).connectRoom(0, rooms.get(1));
		rooms.get(5).connectRoom(2, rooms.get(4));
		
	}

}