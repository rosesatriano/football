package strategydesignpattern;

/**
 * QuarterBack is a class that extends the class Player. QuarterBack
 * includes a few methods that declares what behavior they have.
 * This sets what the offense or defense behavior would be.
 * @author rosesatriano
 *
 */
public class QuarterBack extends Player {
	/**
	 * The method QuarterBack initializes the name of the player and
	 * the offense or defense behavior.
	 * @param name This is the name given in the driver.
	 */
	public QuarterBack(String name){
		super(name);
		this.setOffenceBehavior();
		this.setDefenceBehavior();
	}
	
	/**
	 * setOffenceBehavior is used to randomize whether the offence
	 * uses a pass behavior or run behavior.
	 */
	public void setOffenceBehavior() {
		int behavior = (int)(Math.random() * 2);
		if(behavior == 0) {
			offenceBehavior = new PassBehavior();
		}else {
			offenceBehavior = new RunBehavior();
		}
	}
	
	/**
	 * This method sets the defence behavior as null because the 
	 * quarterback plays offence.
	 */
	public void setDefenceBehavior() {
		defenceBehavior = null;
	}
		
	
}
