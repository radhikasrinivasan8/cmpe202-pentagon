    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crab extends Actor
{
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        trick();
    }    
    private void trick()
    {
    //move(4);
    //turn(3);
    if(Greenfoot.isKeyDown("up"))
    {     
        setLocation(getX(), getY()-2);

    }
    if(Greenfoot.isKeyDown("down"))
        {
       
        setLocation(getX(), getY()+2);
        
        }
    
}
    
}
