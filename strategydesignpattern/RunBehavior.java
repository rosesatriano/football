package strategydesignpattern;

/**
 * RunBehavior implements OffenceBehavior where a method called play
 * determines which run is made and returns a run statement.
 * @author rosesatriano
 */
public class RunBehavior implements OffenceBehavior{
	/**
	 * The string method play randomizes the move and places that 
	 * move into the return statement.
	 * @param moves This is a string array that lists the different
	 * moves for the run behavior. 
	 * @param randomMove This stores a random value that is later 
	 * used to determine what part of the array to use.
	 * @return This returns the statement "runs a " and then
	 * includes a move from the moves array, which is picked from
	 * the number generated from randomMove.
	 */
	public String play() {
		String[] moves = {"drive(up the gut)", "draw", "pitch", "reverse"};
		int randomMove = (int)Math.random() * 4;
		return "runs a " + moves[randomMove];
	}
}
