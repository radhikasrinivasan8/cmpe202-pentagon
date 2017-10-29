import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
   
      
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        while ((getObjects(Factory.class).size ()< 5))
        {
        
            moreDiamonds();
    }
    }
    
    
    public void moreDiamonds()
    {   
        greenFactory gf = new greenFactory();
        redFactory rf = new redFactory();
        yellowFactory yf = new yellowFactory();
        int rnum = Greenfoot.getRandomNumber(4);
        
        
       
        
        if (rnum ==0)
        {
           addObject( gf, 500, Greenfoot.getRandomNumber(400));
           addObject(rf, 700, Greenfoot.getRandomNumber(400));
        }
        
        else if(rnum == 1 || rnum == 2 || rnum ==3)
        {
            addObject( yf, 600, Greenfoot.getRandomNumber(400));
            addObject(gf, 400, Greenfoot.getRandomNumber(400));
            addObject(rf, 500, Greenfoot.getRandomNumber(400));
        }
        
        else if(rnum == 4)
        {
            addObject(yf, 500, Greenfoot.getRandomNumber(400));
            addObject(gf, 600, Greenfoot.getRandomNumber(400));
        }
        
        
        
        
    }
   public void act() 
    {
        
        MyWorld m = new MyWorld();
        m.moreDiamonds();
        // Add your action code here.
    }     
    
    
}
  