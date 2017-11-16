import greenfoot.Actor;
import greenfoot.Greenfoot;

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Enemy extends Actor
{
    private String word;
    private int speed;
    private int count;
    
    public void init(String word, int speed) {
        this.word = word;
        this.speed = speed;
        count = 0;
    }
    
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        TypingMaster world = (TypingMaster) getWorld();
        
        if(count++ % world.getDifficuly().getGameSpeed() == 0) {
            setLocation(getX() - 1, getY());
        }
    }
    
    public abstract Class[] getEnemies();
    
    public Enemy generateEnemy(TypingMaster world){
        //TypingGame world = (TypingGame) World.getWorld();
        Enemy enemy = null;
        Class[] enemies = getEnemies();
        if(enemies != null) {
            try {
                enemy = (Enemy) enemies[Greenfoot.getRandomNumber(enemies.length)].newInstance();
                enemy.init(world.getDifficuly().getRandomWord(), world.getDifficuly().getGameSpeed());
            }
            catch (Exception e) {
                e.printStackTrace();
                Greenfoot.stop();
            }
        }
        return enemy;
    }
    
    /**
     * Returns the game speed
     * @return game speed
     */
    public int getSpeed() {
        return speed;
    }
    
    /**
     * Current Word
     * @return
     */
    public String getWord() {
        return word;
    }
}
