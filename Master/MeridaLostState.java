/**
 * Write a description of class MeridaLostState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MeridaLostState implements iMeridaState  
{
    public Brave brave;

    public MeridaLostState(Brave brave)
    {
        this.brave = brave;
    }

    public  boolean isAlive()
    {
        return true;
    }
    
    public boolean isDead()
    {
        return false;
    }
    
     
    public void setState()
    {
        //brave.setState(brave.getBraveDeadState());
    }
    
    public void display()
    {
    	System.out.println("Health end State- happy banner");
    	brave.getWorld().addObject(new GameOverScreen("Merida-lost.gif"), 500, 125);
    }
}
