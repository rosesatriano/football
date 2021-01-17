package strategydesignpattern;

/**
 * Lineman is a class that extends the class Player. Lineman includes
 * a few methods that declares what behavior they have.
 * This sets what the offense or defense behavior would be.
 * @author rosesatriano
 *
 */
public class Lineman extends Player{
	/**
	 * The Lineman method initializes the name of the player and
	 * the offense or defense behavior.
	 * @param name This is the name given in the driver.
	 */
	public Lineman(String name){
		super(name);
		this.setOffenceBehavior();
		this.setDefenceBehavior();
	}
	/**
	 * setOffenceBehavior sets the offenceBehavior to the
	 * OBlockBehavior.
	 */
	public void setOffenceBehavior(){
		offenceBehavior = new OBlockBehavior();
	}
	/**
	 * setDefenceBehavior is used to randomize whether the 
	 * defence behavior is block, strip, or sack.
	 * @param behavior This stores the place of the random number
	 * generated, which is used to pick which defenceBehavior is chosen.
	 */
	public void setDefenceBehavior(){
		int behavior = (int)Math.random()*3;
        if (behavior == 0){
        	defenceBehavior = new BlockBehavior();
        } else if (behavior == 1) {
        	defenceBehavior = new StripBehavior();
        } else {
        	defenceBehavior = new SackBehavior(); 
        }
	}
}
