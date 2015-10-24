package HomeExam;


public class GUI{
	

	public GUI(){
		
	}
	

	
	public static void drawGUI(){
		if(The_Game.activeRoom != The_Game.previousRoom){
			System.out.println(The_Game.activeRoom.roomMessage);
		}
		if(The_Game.failedAction){
			System.out.println("You stumble and fall, please go east [e] to enter the cave");
			The_Game.failedAction = false;
		}
		
	}
	
}
