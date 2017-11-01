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
        //while ((getObjects(Factory.class).size ()< 5))
        {

            moreDiamonds();
        } 

    }

    public void moreDiamonds()
    {   
        greenFactory gf = new greenFactory();
        redFactory rf = new redFactory();
        yellowFactory yf = new yellowFactory();
        int rnum1 = Greenfoot.getRandomNumber(3);
        //System.out.println("rnum1" +rnum1);
        int rnum2 = Greenfoot.getRandomNumber(3);
        //System.out.println("rnum2" +rnum2);

        if(getObjects(Factory.class).size() < 3)
        {

            if (rnum1 ==0)

            {
                addObject( gf.makeDiamonds(), 600, 200);

            }

            else if(rnum1 == 1 )
            {
                addObject( yf.makeDiamonds(), 600, 200);

            }

            else if(rnum1 == 2)
            {

                addObject(rf.makeDiamonds(), 600, 200);
            }
            
             if (rnum2 ==0)

            {
                addObject( gf.makeDiamonds(), 600, 350);

            }

            else if(rnum2 == 1 )
            {
                addObject( yf.makeDiamonds(), 600, 350);

            }

            else if(rnum2 == 2)
            {

                addObject(rf.makeDiamonds(), 600, 350);
            }
            
            
        }
    }
        
        

      
    


    public void act() 
    {

        MyWorld m = new MyWorld();
        //m.moreDiamonds();
        // Add your action code here.
    }     

}
