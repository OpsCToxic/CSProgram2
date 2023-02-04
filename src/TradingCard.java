
public class TradingCard {
	protected String name;
	protected String image;
	
	/**
	 * This constructor assigns the arguments from the TradingCard and its child class' objects to the protected fields of TradingCard class.
	 * @param cardName
	 * @param cardImage
	 */
	public TradingCard(String cardName, String cardImage) {
		name = cardName;
		image = cardImage;
	}
	
	/**
	 * This accessor instance method returns the String associated with the field "name".
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * This accessor instance method returns the String associated with the field "image".
	 * @return
	 */
	public String getImg() {
		return image;
	}
	
	/**
	 *This overloaded toString() method overrides the existing toString() method in the Object class and returns the field "name".
	 */
	@Override
	public String toString() {
		return getName() ;
	}

}
