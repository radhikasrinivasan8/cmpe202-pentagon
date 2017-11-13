import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Diamonds here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public  class Diamonds extends Actor
{



private int velocity = 3;
    public int x;
    private int outOfBoundary = 0;



    public void moveLeft ()
        {
            setLocation(getX() - velocity, getY());
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
            getWorld().removeObject(this);
            Greenfoot.playSound("bell_3.wav");

        }
    }


    public void act()
    {
    moveLeft();

    if (getX() <= outOfBoundary)
         {
             getWorld().removeObject(this);
        }
      despawning();

    }


}
