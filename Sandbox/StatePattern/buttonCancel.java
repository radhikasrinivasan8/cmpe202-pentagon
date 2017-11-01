import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class buttonPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class buttonCancel extends Actor
{
    /**
     * Act - do whatever the buttonPlay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public buttonCancel(){
        GreenfootImage image = getImage();
        image.scale(50,50);
        setImage(image);
    }
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {//true if you clicked at this object;
           Greenfoot.stop();

          
        }
    }    
}
