import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    int x;
    int started=0;
    public GamePoints gp;
    public CrabWorld()
    {    
        super(1000, 500, 1); 
     gp=new GamePoints();
      addObject(new buttonPlay(), 300, 200);
      spawnSpikes();
      
    }
    public void start()
    {
         started=1;
     gp=new GamePoints();
     addObject(gp, 200, 100);
     addObject(new RH(), 100, 300);
     addObject(new spawner(), 300, 303);
     
    }
       public void spawnSpikes()
    {
        if (started==1)
        {
        x=Greenfoot.getRandomNumber(4);
        if (x==0)
        {
            
            addObject(new spike(), 600, 265);
            //addObject(new spike(), 700+Greenfoot.getRandomNumber(200), 303);
        }
        if (x==1)
        {
            addObject(new spike(), 600, 303);
            //addObject(new spike(), 700+Greenfoot.getRandomNumber(200), 303);
        }
        if (x==2)
        {       
            addObject(new spike(), 600, 303);
            addObject(new spike(), 562, 303);
            //addObject(new spike(), 700+Greenfoot.getRandomNumber(200), 303);
        }
        if (x==3)
        {
            addObject(new spike(), 600, 303);
            addObject(new spike(), 562, 303);
            addObject(new spike(), 524, 303);
            //addObject(new spike(), 700+Greenfoot.getRandomNumber(200), 303);
        }

    }
}
}
