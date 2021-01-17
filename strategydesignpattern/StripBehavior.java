package strategydesignpattern;

/**
 * StripBehavior implements DefenceBehavior where it should return a 
 * statement "Strip a ball from runners hands".
 * @author rosesatriano
 *
 */
public class StripBehavior implements DefenceBehavior {
	/**
	 * Play is a string method that includes a return method.
	 * @return This returns "Strip a ball from runners hands", 
	 * which is just the chosen statement for this behavior.
	*/
	public String play() {
		return "Strip a ball from runners hands";
	}
}
