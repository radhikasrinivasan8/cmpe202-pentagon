import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class spawner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class spawner extends Actor
{
    public int level=0;
    public int difficulty=75;
    /**
     * Act - do whatever the spawner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       level++;
       if(level%(difficulty*3) == 0){
           myWorld m = (myWorld) getWorld();
            
        }
       if(level % difficulty == 0)
       {
            myWorld m = (myWorld) getWorld();
            m.spawnSpikes();
            if (difficulty>60)
            {
                difficulty--;
            }
       }
       
    }
}
