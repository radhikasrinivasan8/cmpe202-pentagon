import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;

import java.awt.Color;
import java.util.Arrays;

public class SettingsScreen extends Scene
{
    
    private Difficulty easy;
    private Difficulty medium;
    private Difficulty hard;
    
    private Button playButton;
    private gameOver gameOverScreen;
    private myWorld world;
    
    private Button easyLevelButton;
    private Button mediumLevelButton;
    private Button hardLevelButton;
    private Button mainMenu;
    
    public SettingsScreen() {
        easy = new Easy();
        medium = new Medium();
        hard = new Hard();
        
        gameOverScreen = new gameOver(new GreenfootImage("MeridaHappy.jpg"));
        
        playButton = new Button("Play");
        spaceThemeButton = new Button("Space");
        underWaterThemeButton = new Button("Ocean");
        easyLevelButton = new Button("Easy");
        mediumLevelButton = new Button("Medium");
        hardLevelButton = new Button("Hard");
        mainMenu = new Button("Main Menu");
        playButton.setIsButton(true);
        spaceThemeButton.setIsButton(true);
        underWaterThemeButton.setIsButton(true);
        easyLevelButton.setIsButton(true);
        mediumLevelButton.setIsButton(true);
        hardLevelButton.setIsButton(true);
        mainMenu.setIsButton(true);
    }
    
    public void act() 
    {
        
        
        // Reduce the number of times the data is process by executing only when a click is registered
        if(Greenfoot.mouseClicked(null)) {
            //System.out.println("In act");
            // Change difficulty to Easy if it's been clicked on
            if(Greenfoot.mouseClicked(easyLevelButton)) {
                world.setDifficuly(easy);
            }
            
            // Change difficulty to Medium if it's been clicked on
            if(Greenfoot.mouseClicked(mediumLevelButton)) {
                world.setDifficuly(medium);
            }
            
            // Change difficulty to Hard if it's been clicked on
            if(Greenfoot.mouseClicked(hardLevelButton)) {
                world.setDifficuly(hard);
            }
            
            // Change Theme to Space if it's been clicked on
            if(Greenfoot.mouseClicked(spaceThemeButton)) {
                world.setTheme(space);
                world.setBackground(world.getTheme().getBackground());
                
            }
            
            // Change Theme to Underwater if it's been clicked on
            if(Greenfoot.mouseClicked(underWaterThemeButton)) {
                world.setTheme(underwater);
                world.setBackground(world.getTheme().getBackground());
            }
            
            // Change the Scene to the Game Screen
            if(Greenfoot.mouseClicked(playButton)) {
                world.setScene(world.getGameScreen());
            }
            
            if(Greenfoot.mouseClicked(mainMenu)) {
                world.setScene(world.getMainMenu());
            }
            
            // Updates the Text
            updateText();
        }
    }
    
    
    /**
     * Updates the text
     */
    private void updateText() {
        banner.setImage(new GreenfootImage(generateInfoButtonString(), 35, Color.WHITE, new Color(0,0,0,0)));
       // banner.getImage().scale(6 * TypingGame.GRID_SIZE, 1 * TypingGame.GRID_SIZE);
    }
    
    
    
    public void enterScene() {
        // Add actors to world        
        world = (myWorld) getWorld();
        

        
        // Add Difficulty: Easy
        world.addObject(easyLevelButton, 11, 4);
        //easy.getImage().scale(3 * world.GRID_SIZE, 1 * world.GRID_SIZE);
        
        // Add Difficulty: Medium
        world.addObject(mediumLevelButton, 11, 5);
        //medium.getImage().scale(3 * world.GRID_SIZE, 1 * world.GRID_SIZE);
        
        // Add Difficulty: Hard
        world.addObject(hardLevelButton, 11, 6);
        //hard.getImage().scale(3 * world.GRID_SIZE, 1 * world.GRID_SIZE);
        
        // Add play game
        world.addObject(playButton, 8, 3);
        world.addObject(mainMenu, 8, 7);
        //Greenfoot.delay(100);
        //playButton.getImage().scale(4 * world.GRID_SIZE, 2 * world.GRID_SIZE);
        //System.out.println("between two");
        // Add Info To Screen
        world.addObject(banner, 8, 2);
        updateText();
    }
    
    public void exitScene() {
        // Remove the objects from the world
        world.removeObjects(Arrays.asList(new Actor[] {playButton, easyLevelButton, mediumLevelButton, hardLevelButton, gameOver, mainMenu}));
    }
    
    
    
    private String generateInfoButtonString() {
        if(world != null) {
            String theme = world.getTheme().getClass().getName();
            String difficulty = world.getDifficuly().getClass().getName();
            return String.format("Theme=%-12s Difficulty=%-12s", theme.trim(), difficulty.trim());
        }
        else {
            return "";
        }
    }
}
