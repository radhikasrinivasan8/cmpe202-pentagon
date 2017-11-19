import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class buttonPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class buttonPlay extends Actor
{
    /**
     * Act - do whatever the buttonPlay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public buttonPlay(){
        GreenfootImage image = getImage();
        image.scale(40,40);
        setImage(image);
    }
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {//true if you clicked at this object;
           System.out.println("play clicked");
           myWorld m = (myWorld) getWorld();
           m.removeObject(this);
           m.start();
           System.out.println("Timer did not start");
	       m.timer.mark();    
	       System.out.println("Timer start");
          
        }
    }    
}
