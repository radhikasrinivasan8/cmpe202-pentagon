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
    public int x,y;
    private ArrayList<scoreObserver> observers = new ArrayList<scoreObserver>() ;
	GamePoints gp=new GamePoints();
	public Brave()
	{
	Context context = new Context(new FastMovement());
	MeridaAliveState = new MeridaAliveState(this); // * state pattern 1*
    MeridaLostState = new MeridaLostState(this); // * state pattern 1*
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
        x=this.getX();
         y=this.getY();
        
        Meridamovement up=new Movemerida(this.x,this.y,this);
        Command c1=new MoveUp(up);
        KeyBoardButton upbutton=new KeyBoardButton(c1);
        upbutton.press();
        
       // setLocation(getX(), getY()-6);
    }
}

 if(getY()<550)
        {
    if(Greenfoot.isKeyDown("down"))
        {
            int x=this.getX();
            int y=this.getY();
            Meridamovement down=new Movemerida(x,y,this);
            Command c2=new MoveDown(down);
            KeyBoardButton downbutton=new KeyBoardButton(c2);
            downbutton.press();
        //setLocation(getX(), getY()+2);
        }
    }
     if(getX()>50)
        { 
    
    if(Greenfoot.isKeyDown("left"))
        {
       int x=this.getX();
            int y=this.getY();
            Meridamovement back=new Movemerida(x,y,this);
            Command c3=new MoveBack(back);
            KeyBoardButton backbutton=new KeyBoardButton(c3);
            backbutton.press();
       // setLocation(getX()-4, getY());
       
        }
    }
       
    if(getX()<950)
    if(Greenfoot.isKeyDown("right"))
        {
       int x=this.getX();
            int y=this.getY();
            Meridamovement front=new Movemerida(x,y,this);
            Command c4=new MoveFront(front);
            KeyBoardButton frontbutton=new KeyBoardButton(c4);
            frontbutton.press();
        //setLocation(getX()+4, getY());
        }
    }
    
    public void display() {
        MeridaState.display();
    }
    void setState(iMeridaState state) {
    	
        this.MeridaState = state;
        System.out.println("State set to: "+this.MeridaState);
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
