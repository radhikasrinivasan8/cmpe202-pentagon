import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScrollingWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScrollingWorld extends World
{
    private static final String bgImageName = "a.png";
    private static final double scrollSpeed = 2.5;
    private static final int picWidth = (new GreenfootImage(bgImageName)).getWidth();
 
    private GreenfootImage bgImage, bgBase;
    private int scrollPosition = 0;
    int x;
    int started=0;
    
    public GamePoints gp;
    /**
     * Constructor for objects of class ScrollingWorld.
     * 
     */
    public ScrollingWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1);  
        setBackground(bgImageName);
        gp=new GamePoints();
        spawnSpikes();
        addObject(new buttonPlay(), 300, 200);
        addObject(new GamePoints(), 500, 300);
        bgImage = new GreenfootImage(getBackground());
        bgBase = new GreenfootImage(picWidth, getHeight());
        bgBase.drawImage(bgImage, 0, 0);
    }
    public void act()
    {
        scrollPosition -= scrollSpeed;
        while(scrollSpeed > 0 && scrollPosition < -picWidth) scrollPosition += picWidth;
        while(scrollSpeed < 0 && scrollPosition > 0) scrollPosition -= picWidth;
        paint(scrollPosition);
    }
     
     private void paint(int position)
    {
        GreenfootImage bg = getBackground();
        bg.drawImage(bgBase, position, 0);
        bg.drawImage(bgImage, position + picWidth, 0);
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
