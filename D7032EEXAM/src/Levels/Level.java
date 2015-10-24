package Levels;

import java.util.ArrayList;

import Enteties.Boss;
import Enteties.Monster;
import HomeExam.The_Game;
import Items.Item;
import Items.Key;
import Items.Potion;
import Items.Weapon;

public class Level {
	ArrayList<Room> rooms = new ArrayList<Room>();
	public Level() {
		createRooms();
		connectRooms();
		lockDoors();
		spawnMonster();
		placeItems();
		
	}



	private void createRooms() {
		String description;
		
		// Making room 0
		description = "Welcome " + The_Game.player.getName() + " to your treasure hunt. Beware of the dragon!\n"
				+ "You are standing outside a cave. There is a smell of sulfur coming from the opening\n"
				+ "The cave opening is to your east. Write \"e\" and press [Enter] to enter the cave";
		rooms.add(new Room(null,null,description));
		
		// Making room 1
		description = "The room is lit by a few candles sitting on a table in front of you.";
		
		rooms.add(new Room(null,null,description));
		
		// Making room 2
		description = "You see a dead body on the floor.";
		
		rooms.add(new Room(null,null,description));
		
		// Making room 3
		description = "You see an exit to the east, a room to the west and a room to the south";
		
		rooms.add(new Room(null,null,description));
		
		// Making room 4
		description = "The room is dark and you sence that a mighty creature lives here";

		rooms.add(new Room(null,null,description));
		
		// Making room 5
		description = "You see a room filled with barrels and crates";
		
		rooms.add(new Room(null,null,description));
		
		// Making room 6
		description = "You stand among all the dragon treasure, but can you escape?";
		
		rooms.add(new Room(null,null,description));
		
		// Making room 7
		description = "THEEND";
		
		rooms.add(new Room(null,null,description));
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
		
		// room 3, west to room 2, or south to room 4 or east to exit
		rooms.get(3).connectRoom(0, rooms.get(2));
		rooms.get(3).connectRoom(3, rooms.get(4));
		rooms.get(3).connectRoom(2, rooms.get(7));
		
		// room 4, west to room 5 or north to room 3 or east to room 6
		rooms.get(4).connectRoom(0, rooms.get(5));
		rooms.get(4).connectRoom(1, rooms.get(3));
		rooms.get(4).connectRoom(2, rooms.get(6));
		
		// room 5, north to room 1 or east to room 4
		rooms.get(5).connectRoom(1, rooms.get(1));
		rooms.get(5).connectRoom(2, rooms.get(4));
		
		// room 6, west to room 4
		rooms.get(6).connectRoom(0, rooms.get(4));

		
	}
	
	private void lockDoors() {
		rooms.get(4).lockDoor(2, 1);
	}
	
	private void placeItems() {
		rooms.get(2).addItem(new Weapon("Sword", "You see a sword next to the dead body.","sword",1));
		rooms.get(4).addItem(new Potion("Health Potion", "You see a health potion on the floor.", 1,10));
		rooms.get(5).addItem(new Key("Key", "You see a key laying on the floor",1));
		rooms.get(6).getMonster().addLoot(new Item("Treasure",""));
	}
	
	private void spawnMonster() {
		rooms.get(3).spawnMonster(new Monster(8, 1, "Beast", "A fearsome beast appears!"));
		rooms.get(6).spawnMonster(new Boss(18,1, "Dragon", 
				"                                                  .~))>>\n"+
						"                                                 .~)>>\n"+
						"                                               .~))))>>>\n"+
						"                                             .~))>>             ___\n"+
						"                                           .~))>>)))>>      .-~))>>\n"+
						"                                         .~)))))>>       .-~))>>)>\n"+
						"                                       .~)))>>))))>>  .-~)>>)>\n"+
						"                   )                 .~))>>))))>>  .-~)))))>>)>\n"+
						"                ( )@@*)             //)>))))))  .-~))))>>)>\n"+
						"              ).@(@@               //))>>))) .-~))>>)))))>>)>\n"+
						"            (( @.@).              //))))) .-~)>>)))))>>)>\n"+
						"          ))  )@@*.@@ )          //)>))) //))))))>>))))>>)>\n"+
						"       ((  ((@@@.@@             |/))))) //)))))>>)))>>)>\n"+
						"      )) @@*. )@@ )   (\\_(\\-\\b  |))>)) //)))>>)))))))>>)>\n"+
						"    (( @@@(.@(@ .    _/`-`  ~|b |>))) //)>>)))))))>>)>\n"+
						"     )* @@@ )@*     (@)  (@) /\\b|))) //))))))>>))))>>\n"+
						"   (( @. )@( @ .   _/  /    /  \\b)) //))>>)))))>>>_._\n"+
						"    )@@ (@@*)@@.  (6///6)- / ^  \\b)//))))))>>)))>>   ~~-.\n"+
						" ( @jgs@@. @@@.*@_ VvvvvV//  ^  \\b/)>>))))>>      _.     `bb\n"+
						" ((@@ @@@*.(@@ . - | o |' \\ (  ^   \\b)))>>        .'       b`,\n"+
						"   ((@@).*@@ )@ )   \\^^^/  ((   ^  ~)_        \\  /           b `,\n"+
						"     (@@. (@@ ).     `-'   (((   ^    `\\ \\ \\ \\ \\|             b  `.\n"+
						"       (*.@*              / ((((        \\| | |  \\       .       b `.\n"+
						"                         / / (((((  \\    \\ /  _.-~\\     Y,      b  ;\n"+
						"                        / / / (((((( \\    \\.-~   _.`\" _.-~`,    b  ;\n"+
						"                       /   /   `(((((()    )    (((((~      `,  b  ;\n"+
						"                     _/  _/      `\"\"\"/   /'                  ; b   ;\n"+
						"                 _.-~_.-~           /  /'                _.'~bb _.'\n"+
						"               ((((~~              / /'              _.'~bb.--~\n"+
						"                                  ((((          __.-~bb.-~\n"+
						"                                              .'  b .~~\n"+
						"                                              :bb ,' \n"+
						"                                              ~~~~\n"+
						"An angry dragon appears"));
	}
	
	public ArrayList<Room> getRooms(){
		return this.rooms;
	}

}