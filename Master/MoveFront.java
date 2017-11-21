/**
 * Write a description of class MoveFront here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoveFront implements Command
{
    Meridamovement movement;
	public MoveFront(Meridamovement newmovement) {
		// TODO Auto-generated constructor stub
		movement=newmovement;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		movement.moveFront();
		
	}
    
    
    
}

