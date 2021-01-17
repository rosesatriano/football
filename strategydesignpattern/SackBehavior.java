package strategydesignpattern;

/**
 * SackBehavior implements DefenceBehavior where it should return a 
 * statement "Sack the quarterback".
 * @author rosesatriano
 *
 */
public class SackBehavior implements DefenceBehavior {
	/**
	 * Play is a string method that includes a return method.
	 * @return This returns "Sack the quarterback", which is just 
	 * the chosen statement for this behavior.
	*/
	public String play() {
		return "Sack the quarterback";
	}
}
