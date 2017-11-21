public class KeyBoardButton{
    Command theCommand;
	
	public KeyBoardButton(Command newCommand){
		theCommand = newCommand;
	}
	public void press(){
		theCommand.execute();
	}

}