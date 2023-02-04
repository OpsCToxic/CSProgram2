
public class GamingCard extends TradingCard {
	protected String category;
	protected String game;

	/**
	 * This constructor first calls the superclass TradingCard's constructor, which assigns the protected fields name and image. Next, the constructor initializes the fields category and game.
	 * @param cardName
	 * @param cardImage
	 * @param cardCategory
	 * @param cardGame
	 */
	public GamingCard(String cardName, String cardImage, String cardCategory, String cardGame) {
		super(cardName, cardImage);
		category = cardCategory;
		game = cardGame;
	}
	
	/**
	 * This accessor method returns the category field of type String in this class.
	 * @return
	 */
	public String getCategory() {
		return category;
	}
	
	/**
	 * This accessor method returns the field game of type String.
	 * @return
	 */
	public String getGame() {
		return game;
	}

	/**
	 * This overrided toString() method overrides the superclass TradingCard's toString() method to return a call to the overrided toString and the game field of type String.
	 */
	@Override
	public String toString() {
		return super.toString() + ": " + game + " character";
	}

}
