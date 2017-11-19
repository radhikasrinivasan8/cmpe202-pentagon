import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 
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
    
    private int scrollPosition = 0;
    int x;
    int started=0;
    private GreenfootImage bgImage, bgBase;
    private static final String bgImageName = "a.png";
    GreenfootSound bgsound = new GreenfootSound("merida.wav");
    private static final double scrollSpeed = 3.5;
    public static int Health=3;
    public static int diamondScore=0;
    private static final int picWidth = (new GreenfootImage(bgImageName)).getWidth();
    public GamePoints gp;
    public static blueDiamond healthscore;
    public static SimpleTimer timer = new SimpleTimer();
    public static Brave brave = new Brave();
    public myWorld()
    {    
    super(1000, 600, 1); 
    prepare();
    }
    public void prepare()
    {
        setBackground(bgImageName);
        gp=new GamePoints();
        healthscore=new blueDiamond();
        spawnSpikes();
        addObject(new GamePoints(), getWidth()-150, 70);
        addObject(new blueDiamond(), getWidth()-350, 70);
        addObject(new DiamondScore(), getWidth()-550, 70);
        
        buttonCancel ButtonCancel = new buttonCancel();
        buttonPlay ButtonPlay = new buttonPlay();
        addObject(ButtonPlay, 500, 500);
        addObject(ButtonCancel, 960, 60 );
        moreDiamonds();
        bgImage = new GreenfootImage(getBackground());
        bgBase = new GreenfootImage(picWidth, getHeight());
        bgBase.drawImage(bgImage, 0, 0);
        brave.setState(brave.MeridaAliveState);
    
    }
    public boolean timeElapsed()
	{
		 //Checks if the game has exceeded the time limit of 1 minute
		 if (timer.millisElapsed() > 30000)
		  {
		     
		   
		   stopGame();
		      return true;           
		      
		  } 
		  else
		  {
		  	
		      return false;
		  }
	}
    public static void stopGame(){
        if(Health < 1) {
        	
        	brave.setState(brave.MeridaLostState);
        	brave.display();
        	
        }
        	
        else {
        	
        	brave.display();
        	
        }
       
        Greenfoot.stop();
       
        setHealth();
        healthscore.update(myWorld.Health);
        
        timer.lastMark = 0;
    }
    public static void setHealth()
    {
    Health=3;
    }
    public void act()
    {
        scrollPosition -= scrollSpeed;
        while(scrollSpeed > 0 && scrollPosition < -picWidth) scrollPosition += picWidth;
        while(scrollSpeed < 0 && scrollPosition > 0) scrollPosition -= picWidth;
        paint(scrollPosition);
        if(timeElapsed()){
          stopGame();
        }
    }
    
    public static int getDiamondScore()
    {
    
    return diamondScore;
    }
    
   
    private void paint(int position)
    {
        GreenfootImage bg = getBackground();
        bg.drawImage(bgBase, position, 0);
        bg.drawImage(bgImage, position + picWidth, 0);
    }

    public void moreDiamonds()
    {   
        greenFactory gf = new greenFactory();
        redFactory rf = new redFactory();
        yellowFactory yf = new yellowFactory();
        
        int rnum1 = Greenfoot.getRandomNumber(50);
        int rnum2 = Greenfoot.getRandomNumber(75);
        int rnum3 = Greenfoot.getRandomNumber(100);

        if(getObjects(Factory.class).size() < 10)
        {
            if (rnum1 ==0)

            {
                addObject( gf.makeDiamonds(), getWidth(), getHeight()-30);
                addObject( yf.makeDiamonds(), getWidth()-150, getHeight()-30);

            }

            else if(rnum1 == 1 )
            {
                addObject( yf.makeDiamonds(), getWidth(), getHeight()-30);

            }

            else if(rnum1 == 2)
            {

                addObject(rf.makeDiamonds(), getWidth(), getHeight()-30);
                
            }
            
           if (rnum2 ==0)

            {
                addObject( gf.makeDiamonds(), getWidth(), getHeight()-110);
                addObject( rf.makeDiamonds(), getWidth(), getHeight()-110);

            }

            else if(rnum2 == 1 )
            {
                addObject( gf.makeDiamonds(), getWidth(), getHeight()-110);

            }

            else if(rnum2 == 2)
            {

                addObject(yf.makeDiamonds(), getWidth(), getHeight()-110);
                
            }
            
            
            
            
           if (rnum3 ==0)

            {
                addObject( gf.makeDiamonds(), getWidth(), getHeight()-150);
                addObject( yf.makeDiamonds(), getWidth(), getHeight()-150);

            }

            else if(rnum3 == 1 )
            {
                addObject( gf.makeDiamonds(), getWidth(), getHeight()-150);

            }

            else if(rnum3 == 2)
            {

                addObject(yf.makeDiamonds(), getWidth(), getHeight()-150);
                
            }
            
            
            
        }
    }
    
    
    
  
    
    public void start()
    {
     //gp=new GamePoints();
     spawnSpikes();
     moreDiamonds();
     //System.out.println("IN SPasdasIKE");
     started=1;
     diamondScore=0;
     bgsound.playLoop();
     addObject(new spawner(),0,0);
     addObject(brave,135,520);
    }
    public void spawnSpikes()
    {
        
    
           if (started==1)
        {
            moreDiamonds();
        x=Greenfoot.getRandomNumber(5);
        if (x==0)
        {
     
            addObject(new blockObstacle(),900,450+Greenfoot.getRandomNumber(200));
        }
      
        if (x==2)
        {       
           
            addObject(new Obstacle(),900,475);
        
        }
       
    }}
}
