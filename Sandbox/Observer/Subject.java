/**
 * Write a description of class Subject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Subject  
{
    
	public abstract void attach(scoreObserver obj);
	public abstract void notifyObservers();

   
}
