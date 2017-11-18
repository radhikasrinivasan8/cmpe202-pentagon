import greenfoot.*;

/**
 * Write a description of class VerticalMovement here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FastMovement implements Movebehaviour
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class VerticalMovement
     */

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void movement(Actor a)
    {
         Obstacle z = (Obstacle) a;
         z.move(-6);
        
        
    }
}
