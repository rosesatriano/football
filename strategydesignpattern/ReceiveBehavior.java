package strategydesignpattern;

/**
 * ReceiveBehavior implements OffenceBehavior where a method called
 * play determines which move the receiver runs.
 * @author rosesatriano
 *
 */
public class ReceiveBehavior implements OffenceBehavior{
	/**
	 * The string method play randomizes the move and places that 
	 * move into the return statement.
	 * @param moves This is a string array that lists the different
	 * moves for the receive behavior. 
	 * @param randomMove This stores a random value that is later 
	 * used to determine what part of the array to use.
	 * @return This returns the statement "runs a " and then
	 * includes a move from the moves array, which is picked from
	 * the number generated from randomMove.
	 */
	public String play() {
		String[] moves = {"slant route", "out route", "seem route", "screen pass", "hail mary"};
		int randomMove = (int)Math.random() * 5;
		return "runs a " + moves[randomMove];
	}
}