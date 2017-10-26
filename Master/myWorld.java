import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class myWorld extends World
{

    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    int x;
    int started=0;
    
    public GamePoints gp;
    public myWorld()
    {    
        super(1000, 700, 1); 
     gp=new GamePoints();
     spawnSpikes();
     addObject(new buttonPlay(), 300, 200);
     addObject(new GamePoints(), 500, 300);
     changebackground();
    }
    
    
    public void changebackground()
    { 
        String nama1 = "a.png"; 
       //String nama2 = "b.jpg"; 
        GreenfootImage bg1=new GreenfootImage(nama1);
        //GreenfootImage bg2=new GreenfootImage(nama2);
        //int z = Greenfoot.getRandomNumber(2);
        setBackground(bg1);    
    }
    
    public void start()
    {
     //gp=new GamePoints();
     spawnSpikes();
     //System.out.println("IN SPasdasIKE");
     started=1;
     addObject(new spawner(),0,0);
     addObject(new Brave(),535,220);
    }
    public void spawnSpikes()
    {
        //System.out.println("IN SPIKE");
        if (started==1)
        {
        x=Greenfoot.getRandomNumber(4);
        if (x==0)
        {
            
            addObject(new spike(), 900, 265);
            //addObject(new spike(), 700+Greenfoot.getRandomNumber(200), 303);
        }
        if (x==1)
        {
            addObject(new spike(), 720, 303);
            //addObject(new spike(), 700+Greenfoot.getRandomNumber(200), 303);
        }
        if (x==2)
        {       
            addObject(new spike(), 900, 150);
            addObject(new spike(), 862, 123);
            //addObject(new spike(), 700+Greenfoot.getRandomNumber(200), 303);
        }
        if (x==3)
        {
            addObject(new spike(), 800, 152);
            addObject(new spike(), 902, 203);
            addObject(new spike(), 794, 103);
            //addObject(new spike(), 700+Greenfoot.getRandomNumber(200), 303);
        }
    }
    }
    
}
