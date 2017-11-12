/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*; 
import greenfoot.MouseInfo;
public class StartScreen extends World 
{
    // instance variables - replace the example below with your own
    buttonPlay play;

    /**
     * Constructor for objects of class StartScreen
     */
    public StartScreen()
    {
        super(800, 600, 1); 
        prepare();
    }
    private void prepare(){
        play = new buttonPlay();
        addObject(new buttonPlay(), 400,400);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void act() {
       
        if(Greenfoot.mouseClicked(this.play)){
          
         //Greenfoot.setWorld(new Stage1());
      }
}
}