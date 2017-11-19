import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Obstacle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Obstacle extends Actor
{
    /**
     * Act - do whatever the Obstacle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public int x;
    private Context context;
    
    blueDiamond b=new blueDiamond();
    public Obstacle(){
        context = new Context(new FastMovement());
    }
    public void despawning()
    {
        x=getX();
        if (x==0)
        {
            getWorld().removeObject(this);
        }
        else if(isTouching(Brave.class))
        {   
            myWorld.Health--;
            if(myWorld.Health>0)
            {
                b.update(myWorld.Health);
            }
            else
            {
            	System.out.println("health is " + myWorld.Health);
                //b.update(3);
                //myWorld.setHealth();
                //Greenfoot.stop();
                System.out.println("health is "+ myWorld.Health);
                myWorld.stopGame();
            }
            // if Health is zero set game OVER STATE
            // ELSE PART
            getWorld().removeObject(this);
        }
    }
    public void act() 
    {
        // Add your action code here.
        context.executeMovement(this);
        despawning();
    }    
}
