import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverScreen extends Actor
{
    /**
     * Act - do whatever the GameOverScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GameOverScreen(String image){
        setImage(image);
    }
    public void act() 
    {
        GifImage gifImage = new GifImage("Angry-Merida-forGameOver.gif");
    }    
}
