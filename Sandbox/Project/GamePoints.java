import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo) // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.Color;
/**
 * Write a description of class GamePoints here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GamePoints extends Actor implements Observer
{
    /**
     * Act - do whatever the GamePoints wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public static int score=0;
   public void update(int points)
   {
    
    score=points;
    act();
   }
    
   public int getscore()
   {
       return score;
    }
   
   public void act() 
    {
        //System.out.println(getscore());
        // Add your action code here.
        setImage(new GreenfootImage("Score : "+ getscore() , 24 , Color.BLACK, Color.WHITE));
    }    
}
