import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import greenfoot.*; 

/**
 * Write a description of class Factory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Factory extends Actor
{
    
    public abstract Diamonds makeDiamonds();
    
    private int velocity = 3;
    public int x;
    private int outOfBoundary = 0;
    
    
   
    public void moveLeft ()
        {
            setLocation(getX() - velocity, getY());
        }
  
        
    public void act() 
    {
    moveLeft();
    
    if (getX() <= outOfBoundary)
         {
             getWorld().removeObject(this);
        }
        
    
    } 
    
}
