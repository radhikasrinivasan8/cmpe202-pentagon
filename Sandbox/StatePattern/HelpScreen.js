import greenfoot.*;
import java.awt.*;
import java.util.Arrays;
/**
 * Write a description of class HelpScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
*/ 
public class HelpScreen extends Screen
{
    /**
     * Act - do whatever the HelpScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
    */
    
    private Button mainMenu;
    myworld world;
    
    public HelpScreen(){
        mainMenu = new Button("Main Menu");
        mainMenu.setIsButton(true);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(null)) {
            
            // Change scene to main menu if it's been clicked on
            if(Greenfoot.mouseClicked(mainMenu)) {
                world.setScene(world.getMainMenu());
            }
        }
    }    
    
    public void enterScene() {
        world = (myworld) getWorld();
        setLocation(8,4);
        int x = this.getX();
        int y = this.getY();
        GreenfootImage img = new GreenfootImage("Help Merida collect diamonds. Watch out for \n"+ 
                                                "spikes. You only have 3 lives. Use up and down \n" +
                                                " arrow keys to change lanes.", 30, Color.white, new Color(0,0,0,0));
        img.setFont(new Font("Comic Sans MS", Font.BOLD, 20 ));
        setImage(img);
        world.addObject(mainMenu,x ,y+2);
    }
    
    public void exitScene() {
         world.removeObjects(Arrays.asList(new Actor[] {mainMenu}));
    }
}
