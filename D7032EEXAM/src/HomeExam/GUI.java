package HomeExam;


public class GUI{
	

	public GUI(){
		
	}
	
	public static void drawRoom(){
		// Moved to a new room
		if(The_Game.activeRoom != The_Game.previousRoom){
			if(The_Game.activeRoom.roomDescription != ""){
				System.out.println(The_Game.activeRoom.roomDescription);
			}
			if(The_Game.activeRoom.hasItem()){
				System.out.println(The_Game.activeRoom.getItem().getItemDescription());
			}
		}
		
		// Failed an action
		if(The_Game.failedAction){
			System.out.println("You stumble and fall");
			
			The_Game.failedAction = false;
		}
		
		// Give player options
		String option = The_Game.activeRoom.getOptions();
		if(The_Game.player.hasPotion()){
			option += ", To use " + The_Game.player.getPotion().getName() + " press [d]";
		}
		
		if(option != ""){
			System.out.println(option);
		}
		
		
		
	}


	// alerts player of something
	public static void alert(String alert) {
		System.out.println(alert);
		
	}

	public static void ending(int treasuers) {
		if(treasuers >= The_Game.MIN_TREASURE_WIN_CONDITION){
			System.out.println(	"                            _.--.\n"+
								"                        _.-'_:-'||\n"+
								"                    _.-'_.-::::'||\n"+
								"               _.-:'_.-::::::'  ||\n"+
								"             .'`-.-:::::::'     ||\n"+
								"            /.'`;|:::::::'      ||_\n"+
								"           ||   ||::::::'     _.;._'-._\n"+
								"           ||   ||:::::'  _.-!oo @.!-._'-.\n"+
								"           \'.  ||:::::.-!()oo @!()@.-'_.|\n"+
								"            '.'-;|:.-'.&$@.& ()$%-'o.'\\U||\n"+
								"              `>'-.!@%()@'@_%-'_.-o _.|'||\n"+
								"               ||-._'-.@.-'_.-' _.-o  |'||\n"+
								"               ||=[ '-._.-\\U/.-'    o |'||\n"+
								"               || '-.]=|| |'|      o  |'||\n"+
								"               ||      || |'|        _| ';\n"+
								"               ||      || |'|    _.-'_.-'\n"+
								"               |'-._   || |'|_.-'_.-'\n"+
								"               '-._'-.|| |' `_.-'\n"+
								"                    '-.||_/.-'\n"+
								"You leave the dungeon with your riches. Congratulations, you won");
		}
		else{
			System.out.println("You coward!");
		}
		
	}
	
}
