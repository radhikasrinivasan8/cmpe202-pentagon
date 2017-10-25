import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class diamond here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class diamond extends Actor
{
    /**
     * Act - do whatever the diamond wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GreenfootImage image = getImage();
 {
    image.scale(image.getWidth()- 250, image.getHeight() - 200);
    setImage(image); 
    
      
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
