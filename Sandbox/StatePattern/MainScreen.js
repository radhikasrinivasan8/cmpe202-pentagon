import greenfoot.Actor;
import greenfoot.Greenfoot;
import java.util.Arrays;

public class MainScreen extends Screen
{
    /**
     * Act - do whatever the MainMenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    myworld world;
    private Button exitButton;
    private Button playButton;
    
    public void act() 
    {
       if(Greenfoot.mouseClicked(null)) {
            // Change scene to game Screen if it's been clicked on
            if(Greenfoot.mouseClicked(playButton)) {
                world.setScene(world.getGameScreen());
            }
            
            // Change scene to help Screen if it's been clicked on
            if(Greenfoot.mouseClicked(helpButton)) {
                world.setScene(world.getHelpScreen());
            }
            
            // Change scene to setting Screen if it's been clicked on
            //if(Greenfoot.mouseClicked(settingsButton)) {
                //world.setScene(world.getSettingsScreen());
            //}
            
            // exit game if it's been clicked on
            if (Greenfoot.mouseClicked(exitButton)) {
                Greenfoot.stop();
            }
        }
            
    }
    
    public void enterScreen() {
        world = (myworld) getWorld();
        exitButton = new Button("Exit");
        playButton = new Button("Play Game");
        helpButton = new Button("Instruction");
        //settingsButton = new Button("Game Settings");
        exitButton.setIsButton(true);
        playButton.setIsButton(true);
        helpButton.setIsButton(true);
        //settingsButton.setIsButton(true);
        world.addObject(playButton,8 ,3);
        world.addObject(helpButton,8 ,4);
        world.addObject(settingsButton,8,5);
        world.addObject(exitButton,8,6);
    }
    
    public void exitScreen() {
        world.removeObjects(Arrays.asList(new Actor[] {playButton, helpButton, settingsButton, exitButton}));
    }
}
