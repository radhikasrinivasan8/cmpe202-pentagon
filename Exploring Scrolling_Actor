import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * This world contains the main part of the scrolling system.
 * 
 * Here you can also limit the world by changing the variables WORLD_WIDTH and WORLD_HEIGHT using the constructor of the class (see ExampleWorld).
 * You can create scrolling worlds in every screen size (the size of the frame) and every scrolling size (the real size of the world).
 * 
 * The GreenfootImage textur is the background image that is used for the scrolling background. You can use any image you want instead of this. 
 * You just have to call the method setScrollingBackground in the constructor of your scrolling world (see ExampleWorld) with the GreenfootImage you want to use for the background.
 * 
 * The scenario will automaticly create a example world. You can delete this world and use another subclass of this world if you want to use the scrolling system in your scenario.
 * 
 * 
 * You shouldn't change the code of this class because that will probably cause problems in the scrolling system.
 */
public abstract class ScrollingWorld extends World
{
    //A maximum size of the Scrolling World. If the value for width or height is 0 the world is infinite in this direction.
    //The variables are final so they have to be set before compiling the game and can't be set while executing the game.
    public static int WORLD_WIDTH;
    public static int WORLD_HEIGHT;
    
    protected int totalXMovement = 0;
    protected int totalYMovement = 0;
    
    //This image is used as the background image of the scrolling world.
    //If you want to use another image just chang the path.
    protected GreenfootImage textur;
    
    public ScrollingWorld(int screenWidth, int screenHeight) {
        super(screenWidth, screenHeight, 1, false);
        WORLD_WIDTH = 0;
        WORLD_HEIGHT = 0;
    }
    public ScrollingWorld(int screenWidth, int screenHeight, int cellSize) {
        super(screenWidth, screenHeight, cellSize, false);
        WORLD_WIDTH = 0;
        WORLD_HEIGHT = 0;
    }
    public ScrollingWorld(int screenWidth, int screenHeight, int scrollingWidth, int scrollingHeight) {
        super(screenWidth, screenHeight, 1, false);
        WORLD_WIDTH = scrollingWidth;
        WORLD_HEIGHT = scrollingHeight;
    }
    public ScrollingWorld(int screenWidth, int screenHeight, int cellSize, int scrollingWidth, int scrollingHeight) {
        super(screenWidth, screenHeight, cellSize, false);
        WORLD_WIDTH = scrollingWidth;
        WORLD_HEIGHT = scrollingHeight;
    }
    
    /**
     * Reset the position of the ScrollingActor and set the position of all other objects in the world.
     */
    public final void resetPlayersPosition(ScrollingActor scrollingActor) {
        int xMovement = (int) ((double) getWidth()/2 - scrollingActor.getExactX());
        int yMovement = (int) ((double) getHeight()/2 - scrollingActor.getExactY());
        totalXMovement += xMovement;
        totalYMovement += yMovement;
        List<Actor> actors = getObjects(Actor.class);
        for (Actor actor : actors) {
            if (actor instanceof ScrollingActor) {
                ((ScrollingActor) actor).setLocation(actor.getX() + xMovement, actor.getY() + yMovement, false);
            }
            else if (actor instanceof Menu || actor instanceof FixedObject) {
                ;
            }
            else {
                actor.setLocation(actor.getX() + xMovement, actor.getY() + yMovement);
            }
        }
        createTextur();
    }
    
    /**
     * Creates a moving textur on the background image of the world.
     */
    protected final void createTextur() {
        int x;
        int y;
        if (totalXMovement > 0) {
            for (x = totalXMovement; x > 0; x -= textur.getWidth()) {
                ;
            }
        }
        else {
            for (x = totalXMovement; x < 0; x += textur.getWidth()) {
                ;
            }
            x -= textur.getWidth();
        }
        if (totalYMovement > 0) {
            for (y = totalYMovement; y > 0; y -= textur.getHeight()) {
                ;
            }
        }
        else {
            for (y = totalYMovement; y < 0; y += textur.getHeight()) {
                ;
            }
            y -= textur.getHeight();
        }
        getBackground().clear();
        for (int i = x; i < getWidth(); i += textur.getWidth()) {
            for (int j = y; j < getHeight(); j += textur.getHeight()) {
                getBackground().drawImage(textur, i, j);
            }
        }
    }
    
    /**
     * Remove all objects that currently are in the world.
     */
    public void removeAllObjects() {
        removeObjects(getObjects(null));
    }
    
    /**
     * Remove all objects that currently are in the world with the exception of the actor given as parameter.
     * 
     * @param actor
     *      The only object that will not be removed from the world.
     */
    public void removeAllObjectsBut(Actor actor) {
        List<Actor> allActors = getObjects(null);
        for (Actor a : allActors) {
            if (!a.equals(actor)) {
                removeObject(a);
            }
        }
    }
    
    /**
     * Change the background image of the scrolling world to the given image.
     * 
     * @param bgImage
     *      The new background image.
     */
    public void setScrollingBackground(GreenfootImage bgImage) {
        textur = bgImage;
    }
    
    /**
     * Returns the width of to scrolling world. (0 => infinite).
     * 
     * @return
     *      The width of the scrolling system. If 0 is returned the world width is infinite.
     */
    public int getScrollingWidth() {
        return WORLD_WIDTH;
    }
    /**
     * Returns the height of to scrolling world. (0 => infinite).
     * 
     * @return
     *      The height of the scrolling system. If 0 is returned the world height is infinite.
     */
    public int getScrollingHeight() {
        return WORLD_HEIGHT;
    }
    
    /**
     * Get the total movement in x direction.
     * 
     * @return
     *      The total movement in x direction the scrolling actor has covered.
     */
    public int getTotalXMovement() {
        return totalXMovement;
    }
    /**
     * Get the total movement in y direction.
     * 
     * @return
     *      The total movement in y direction the scrolling actor has covered.
     */
    public int getTotalYMovement() {
        return totalYMovement;
    }
}


import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This subclass is just an example. You can delete it or change the code if you want.
 * It's not necessary for the scrolling system.
 */
public class ExampleWorld extends ScrollingWorld
{
    
    public ExampleWorld() {
        super(600, 400, 1);//creates an infinite scrolling world with a screen size of 600 x 400;
        //if you want to limitate the scrolling world you have to use this constructor:
        //super(600, 400, 1, scrollingWidth, scrollingHeight);
        setScrollingBackground(new GreenfootImage("weave.jpg"));
        createExampleWorld();//this method just adds some objects to the world.
    }
    
    /**
     * Creates an example world where the ScrollingActor can move.
     */
    public void createExampleWorld() {
        for (int x = getWidth() * -3; x < getWidth() * 3; x += getWidth()/2) {
            for (int y = getHeight() * -3; y < getHeight() * 3; y += getHeight()/2) {
                if (x != getWidth()/2 || y != getHeight()/2) {
                    addObject(new Rock(), x, y);
                }
            }
        }
        for (int x = getWidth() * -3 + getWidth()/2; x < getWidth() * 3; x += getWidth()) {
            for (int y = getHeight() * -3 + getHeight()/4; y < getHeight() * 3; y += getHeight()) {
                addObject(new Enemy(), x, y);
            }
        }
        addObject(new ExampleScrollingActor(), getWidth()/2, getHeight()/2);
    }
}
