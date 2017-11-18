/**
 * Write a description of class MoveDown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoveDown implements Command
{
    Meridamovement movement;
	public MoveDown(Meridamovement newmovement) {
		// TODO Auto-generated constructor stub
		movement=newmovement;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		movement.moveDown();
		
	}
    
    
    
}
