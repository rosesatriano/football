package strategydesignpattern;

/**
 * Receiver is a class that extends the class Player. Receiver
 * includes a few methods that declares what behavior they have.
 * This sets what the offense or defense behavior would be.
 * @author rosesatriano
 *
 */
public class Receiver extends Player{
	/**
	 * The method Receiver initializes the name of the player and
	 * the offense or defense behavior.
	 * @param name This is the name given in the driver.
	 */
	public Receiver(String name){
		super(name);
		this.setOffenceBehavior();
		this.setDefenceBehavior();
	}
	
	/**
	 * This method sets the offenceBehavior to the ReceiveBehavior.
	 */
	public void setOffenceBehavior(){
		offenceBehavior = new ReceiveBehavior();
	}
	
	/**
	 * This method sets the defenceBehavior to null since this is an
	 * offensive position.
	 */
	public void setDefenceBehavior(){
		defenceBehavior = null;
	}
	
}
