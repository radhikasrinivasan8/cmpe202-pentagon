import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bluepoints here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class blueDiamond extends Actor
{
    /**
     * Act - do whatever the bluepoints wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int score=3;
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
        // Add your action code here.
     //   System.out.println(bluep);
        setImage(new GreenfootImage("Health : "+ getscore() , 24 , Color.BLACK, Color.WHITE));
    }    
}
