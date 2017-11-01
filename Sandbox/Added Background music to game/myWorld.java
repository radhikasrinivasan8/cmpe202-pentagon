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
    GreenfootSound bgsound = new GreenfootSound("music.wav");
    
    public GamePoints gp;
    public myWorld()
    {    
        super(1000, 600, 1); 
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
     bgsound.playLoop();
     addObject(new spawner(),0,0);
     addObject(new Brave(),135,520);
    }
    public void spawnSpikes()
    {
       // addObject(new blockObstacle(),0,460);
        //System.out.println("IN SPIKE");
           if (started==1)
        {
        x=Greenfoot.getRandomNumber(8);
        if (x==0)
        {
       //spikeObstacle sp1=new spikeObstacle(new VerticalBehaviour());
       //addObject(sp1,500,565);
       //sp1.doChange(sp1);
            //addObject(new Obstacle(),970,515);
            addObject(new spike(), 900, 515);
            //addObject(new spike(), 700+Greenfoot.getRandomNumber(200), 303);
        }
        if (x==1)
        {
            //addObject(new spike(), 720, 513);
            addObject(new spike(), 700+Greenfoot.getRandomNumber(200), 503);
        }
        if (x==2)
        {       
            //addObject(new spike(), 900, 520);
            //addObject(new spike(), 862, 530);
            addObject(new spike(), 620+Greenfoot.getRandomNumber(200), 503);
            addObject(new Obstacle(),900,475);
        
        }
        if (x==3)
        {
           // addObject(new blockObstacle(),580,415);
            //addObject(new blockObstacle(),150,425);
            addObject(new spike(), 800, 502);
            //addObject(new spike(), 902, 513);
            //addObject(new spike(), 794, 563);
            addObject(new spike(), 750+Greenfoot.getRandomNumber(200), 303);
        }
    
    }}
}
