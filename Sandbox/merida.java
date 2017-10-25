import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Merida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Merida extends Actor
{
    /**
     * Act - do whatever the Merida wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        
       moveandturn();
       eat();
    }
    
    public void moveandturn() 
    {
        move(4);
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            turn (-3);
        }
        
        if (Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }
        
    }
    public void eat()
    {
        Actor diamond;
        diamond = getOneObjectAtOffset(0, 0, diamond.class);
        if(diamond != null)
        {
            World world;
            world = getWorld();
            world.removeObject(diamond);
        }
        
    }
}
    
