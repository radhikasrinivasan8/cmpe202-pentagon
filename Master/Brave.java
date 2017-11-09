import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RH here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;
public class Brave extends Actor implements Subject
{
    /**
     * Act - do whatever the RH wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    iMeridaState MeridaAliveState, MeridaLostState, MeridaState;
    GifImage gifImage = new GifImage("frhupdated.gif");
    private int Points=0;
    private ArrayList<scoreObserver> observers = new ArrayList<scoreObserver>() ;
    GamePoints gp=new GamePoints();
    private SimpleTimer timer = new SimpleTimer();
    public Brave()
    {
    Context context = new Context(new VerticalMovement());
    MeridaAliveState = new MeridaAliveState(this); 
    MeridaLostState = new MeridaLostState(this); 
    MeridaState = MeridaAliveState;
    }
    public int getPoints()
    {
    return Points;
    }
    public void setPoints(int p)
    {
    Points=p;
     
    notifyObservers();    
    }
    public  void attach(scoreObserver obj)
    {
    observers.add(obj);
    }
    public  void notifyObservers()
    {
           gp.update(Points);       
    }
    public void act() 
    {
        // Add your action code here.
        setImage(gifImage.getCurrentImage());
        timer.mark();
        
        trick();
        Points++;
        setPoints(Points);
    }   
    private void trick()
    {
    //move(4);
    //turn(3);
    
    if(getY()<600 && getY()>420)
    {
    if(Greenfoot.isKeyDown("up"))
    {     
        setLocation(getX(), getY()-6);
    }
}

 if(getY()<550)
        {
    if(Greenfoot.isKeyDown("down"))
        {
        setLocation(getX(), getY()+2);
        }
    }
     if(getX()>50)
        { 
    
    if(Greenfoot.isKeyDown("left"))
        {
       
        setLocation(getX()-4, getY());
       
        }
    }
       
    if(getX()<950)
    if(Greenfoot.isKeyDown("right"))
        {
       
        setLocation(getX()+4, getY());
        }
    } 
    
     public void display() {
        MeridaState.display();
    }
    void setState(iMeridaState state) {
        this.MeridaState = state;
    }
    iMeridaState getMeridaAliveState()
    {
        return MeridaAliveState;
    }    
    iMeridaState getMeridaLostState()
    {
        return MeridaLostState;
    }
}
