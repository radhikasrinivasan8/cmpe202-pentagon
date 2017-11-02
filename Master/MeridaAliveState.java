/**
 * Write a description of class MeridaAliveState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MeridaAliveState implements iMeridaState 
{
    // instance variables - replace the example below with your own
    public Brave brave;

    public MeridaAliveState(Brave brave)
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
        //brave.getWorld().addObject(new FinalBanner("youwin.png"), 500, 125);
    }
}
