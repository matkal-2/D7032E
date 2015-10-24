package HomeExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class The_Game {
	public static Room activeRoom;
	public static Room previousRoom;
	public static Level level;
	public static String playerName;
	public static boolean failedAction;

	
	
	public static void main(String[] args) throws Exception{
		
		String welcomeMessage = "Welcome to Dragon Treasure\n Write your name and press [Enter] to start a new game...";
		activeRoom = new Room(null, null, welcomeMessage);
		GUI.drawGUI();
		playerName = UserInput.userInput();
		level = new Level();
		
		activeRoom = level.rooms.get(0);
		
		The_Game the_game = new The_Game();

	}

	public The_Game() throws Exception {
		boolean run = true;
		while(run){
			GUI.drawGUI();
			activeRoom.playerPresent();
		}
	}

	public static void move(Room room) {
		previousRoom = activeRoom;
		activeRoom = room;
	}

}
