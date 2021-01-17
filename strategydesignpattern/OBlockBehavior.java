package strategydesignpattern;

/**
 * OBlockBehavior implements OffenceBehavior where it should return a 
 * statement "block defenders". 
 * @author rosesatriano
 *
 */
public class OBlockBehavior implements OffenceBehavior {
	/**
	 * Play is a string method that includes a return method.
	 * @return This returns "block defenders", which is just the chosen
	 * statement for this behavior.
	 */
	public String play() {
		return "block defenders";
	}
}
