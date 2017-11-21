/**
 * Write a description of class MoveUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoveUp implements Command
{
   Meridamovement movement;
	public MoveUp(Meridamovement newmovement) {
		// TODO Auto-generated constructor stub
		movement=newmovement;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		movement.moveUp();
		
	}
   
}
