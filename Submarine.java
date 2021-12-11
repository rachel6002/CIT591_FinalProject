/**
 * A ship with a length of one tile.
 *
 * @author Huifang Ye & Rachel Kong
 */
public class Submarine extends Ship {
	/**
	 * Sets the inherited length variable and initializes the hit array, based on
	 * the size of this ship (1 tiles).
	 */
	public Submarine() {
		length = 1;
	}

	/**
	 *
	 * @return "Submarine", indicating that this is a Submarine.
	 */
	@Override
	public String getShipType() {
		return "Submarine";
	}
}
