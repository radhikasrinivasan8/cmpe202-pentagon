/**
 * Write a description of class MoveBack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoveBack implements Command
{
    Meridamovement movement;
	public MoveBack(Meridamovement newmovement) {
		// TODO Auto-generated constructor stub
		movement=newmovement;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		movement.moveBack();
		
	}
    
    
    
}
