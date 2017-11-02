import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class blockObstacle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class blockObstacle extends Actor
{
    /**
     * Act - do whatever the blockObstacle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private Context context;
    
    public blockObstacle(){
        context = new Context(new HorizontalMovement());
        
    }
    
    public void act() 
    {
        // Add your action code here.
        context.executeMovement(this);
        
    }    
}
