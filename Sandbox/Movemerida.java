public class Movemerida implements Meridamovement {

	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		System.out.println("Move merida up");
		Brave.setLocation(getX(), getY()-6);
		
		
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		System.out.println("Move merida down");
		Brave.setLocation(getX(), getY()+2);
		
	}
	

}