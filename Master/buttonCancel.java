import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.*;
/**
 * Write a description of class buttonCancel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class buttonCancel extends Actor
{
    /**
     * Act - do whatever the buttonCancel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public buttonCancel(){
    GreenfootImage image = getImage();
        image.scale(40,40);
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)) {//true if you clicked at this object;
           //myWorld m = (myWorld) getWorld();
           //m.removeObject(this);
           //m.start();
           Greenfoot.stop();
           
        }
    }    
}
