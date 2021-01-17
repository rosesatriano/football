package strategydesignpattern;

/**
 * BlockBehavior implements DefenceBehavior where a move is chosen
 * randomly from a String of options. 
 * @author rosesatriano
 *
 */
public class BlockBehavior implements DefenceBehavior{
	/**
	 * This method is used to create a string of moves that is randomly
	 * picked to be placed as the block behavior.
	 * @param moves This is the name of the string of the options for
	 * the block behavior.
	 * @param randomMove this is the parameter that creates a random 
	 * number that will be used to pick the move from the string.
	 * @return This returns "block a " and the random move generated
	 * from the string.
	 */
	public String play(){
		String[] moves = {"kick", "punt", "pass", "catch"};
		int randomMove = (int)Math.random() * 4;
		return "block a " + moves[randomMove];
	}
}
