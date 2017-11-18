import greenfoot.*;

/**
 * Write a description of class HorizontalMovement here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SlowMovement implements Movebehaviour
{
    // instance variables - replace the example below with your own
   

    /**
     * Constructor for objects of class HorizontalMovement
     */
    

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
    
    public void movement(Actor a)
    {
        blockObstacle z = (blockObstacle) a;     
         z.move(-3);
        }
}
