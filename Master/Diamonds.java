import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Diamonds here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Diamonds extends Actor
{
   
    
    
private int velocity = 3;
    public int x;
    private int outOfBoundary = 0;
    
    
   
    public void moveLeft ()
        {
            setLocation(getX() - velocity, getY());
        }
  public void despawningdiamonds()
    {
        x=getX();
        if (x==0)
        {
            getWorld().removeObject(this);
        }
        else if(isTouching(Brave.class))
        {   
            myWorld.diamondScore++;
            getWorld().removeObject(this);
        }
    }
          
    public void act() 
    {
    moveLeft();
    despawningdiamonds();
    //if (getX() <= outOfBoundary)
        // {
       //      getWorld().removeObject(this);
     //   }
    } 
}
    
