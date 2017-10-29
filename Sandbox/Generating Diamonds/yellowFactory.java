import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class yellowFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class yellowFactory extends Factory
{
   public Diamonds makeDiamonds(){
       return new yellow();
}
}
