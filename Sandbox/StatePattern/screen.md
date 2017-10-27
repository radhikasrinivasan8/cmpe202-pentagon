public class HumanAliveState implements iHumanState  
{
    public Human human;
    
    public HumanAliveState(Human human)
    {
        this.human = human;
    }

    public  boolean isAlive()
    {
        return true;
    }
    
    public boolean isDead()
    {
        return false;
    }
    
     
    public void setState()
    {
        human.setState(human.getHumanDeadState());
    }
    
    public void display()
    {
        human.getWorld().addObject(new FinalBanner("youwin.png"), 500, 125);
    }
}
