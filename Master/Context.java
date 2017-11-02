import greenfoot.*;

public class Context  
{
   
    private Movebehaviour strategy;
 
    public Context(Movebehaviour strategy) {
        this.strategy = strategy;
    }
    public void executeMovement(Actor a) {
        this.strategy.movement(a);
    }

}