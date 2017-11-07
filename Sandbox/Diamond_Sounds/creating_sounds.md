public class basket extends Actor
{   int speed = 10;
    /**
     * Act - do whatever the basket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void move()
    {
        //System.out.println("move funtion called");
        /*if (Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-1);
        }
         
        if (Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+1);
        }*/
        if (Greenfoot.isKeyDown("left")&& getX()>10+getImage().getWidth()/2){ 
            setLocation(getX() - speed, getY());
            Greenfoot.playSound("wind.wav");
             
        }
         
        if (Greenfoot.isKeyDown("right")&& getX()<getWorld().getWidth()-getImage().getWidth()/2-10){ 
             
        }
     }
      
     public void act() 
     {
         makeSmoke(); // use this code to declare make smoke   
         move();
     }
      
      /**
     * Produce a puff of smoke
     */
    public void  makeSmoke()
    {
        getWorld().addObject ( new smoke(), getX(), getY());
         
    }
       
      //public boolean atWorldEdge()  // How to make the new object appear automatically onto the stage
      //if (getX() < 10 || getX() > getWorld().getWidth() - 10) {
        //  return true;
        // }
         //if (getY() < 10 || getY() > getWorld().getHeight() - 10) {
             // return true;
              
             //}
             //return false;
             //}
      
         
}
