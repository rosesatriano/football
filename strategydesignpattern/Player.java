package strategydesignpattern;

/**
 * Player is a parent class that includes several methods. This class
 * initializes the player's name, the offence behavior, the defence
 * behavior, and the play chosen.
 * @author rosesatriano
 *
 */
public class Player {
	protected String name;
	private boolean defence;
	protected DefenceBehavior defenceBehavior;
	protected OffenceBehavior offenceBehavior;
	
	/**
	 * In the method Player, this is where the name, defence behavior,
	 * offence behavior, and defence are initialized.
	 * @param name This is the string for the player's name.
	 */
	public Player(String name){
		this.name = name;
		this.setDefenceBehavior();
		this.setOffenceBehavior();
		this.defence = false;
	}
	
	/**
	 * setDefenceBehavior method is used to initialize the 
	 * defenceBehavior as null.
	 */
	public void setDefenceBehavior(){
		this.defenceBehavior = null;
	}
	
	/**
	 * setOffenceBehavior method is used to initialize the 
	 * offenceBehavior as null.
	 */
	public void setOffenceBehavior(){
		this.offenceBehavior = null;
	}
	
	/**
	 * The string method play is used to determine what behavior is
	 * used for offense and defense.
	 * @return The first return is used if the defenceBehavior is null,
	 * which means that player is not playing.
	 * @return The second return is used if the defenceBehavior is 
	 * not null, which then returns the defence behavior.
	 * @return The third return is used if the offenceBehavior is null,
	 * which means that player is not playing.
	 * @return The second return is used if the offenceBehavior is 
	 * not null, which then returns the offence behavior.
	 */
	public String play(){
		if(this.defence){
			if(this.defenceBehavior == null){
				return "is not playing";
			} else{
				return this.defenceBehavior.play();
			}
		} else {
			if(this.offenceBehavior ==  null){
				return "is not playing";
			} else {
				return this.offenceBehavior.play();
			}
		}
	}
	/**
	 * This method sets the boolean of defence to true.
	 */
	public void turnover() {
		this.defence = true;
	}
	
}
