package strategydesignpattern;

/**
 * PassBehavior implements OffenceBehavior where a method called play
 * determines which pass is thrown and returns a pass statement.
 * @author rosesatriano
 *
 */
public class PassBehavior implements OffenceBehavior {
	/**
	 * The string method play randomizes the move and places that 
	 * move into the return statement.
	 * @param moves This is a string array that lists the different
	 * moves for the pass behavior. 
	 * @param randomMove This stores a random value that is later 
	 * used to determine what part of the array to use.
	 * @return This returns the statement "throws a " and then
	 * includes a move from the moves array, which is picked from
	 * the number generated from randomMove.
	 */
	public String play() {
		String[] moves = {"slant route", "out route", "seem route", "screen pass", "hail mary"};
		int randomMove = (int)Math.random() * 5;
		return "throws a " + moves[randomMove];
	}
}