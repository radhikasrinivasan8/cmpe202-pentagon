import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RH here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RH extends Actor
{
    /**
     * Act - do whatever the RH wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage gifImage = new GifImage("RH.gif");

    public void act() 
    {
        // Add your action code here.
        setImage(gifImage.getCurrentImage());
        trick();
    }    
    private void trick()
    {
    //move(4);
    //turn(3);
    if(Greenfoot.isKeyDown("up"))
    {     
        setLocation(getX(), getY()-2);

    }
    if(Greenfoot.isKeyDown("down"))
        {
       
        setLocation(getX(), getY()+2);
        
        }
    
}
    
}
