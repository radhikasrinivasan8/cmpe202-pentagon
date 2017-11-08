public class HumanDeadState implements iHumanState
{
    
    public Human human;
    public HumanDeadState(Human human)
    {
        this.human = human;
    }

    public  boolean isAlive()
    {
        return false;
    }
    
    public boolean isDead()
    {
        return true;
    }
    
    public void setState() { 
    
    }
    
    public void display()
    {
        human.getWorld().addObject(new FinalBanner("gameover.png"), 500, 125);
    }
}
