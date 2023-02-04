
public class PokemonCard extends GamingCard {
	protected String type;
	protected Integer pokedex;
	protected String ability;

	/**
	 * This constructor first calls the superclass GamingCard's constructor, which initializes the name, image, category, and game fields, an then initializes the type, pokedex, and ability fields.
	 * @param cardName
	 * @param cardImage
	 * @param cardCategory
	 * @param cardGame
	 * @param pokemonType
	 * @param pokedexNumber
	 * @param pokemonAbility
	 */
	public PokemonCard(String cardName, String cardImage, String cardCategory, String cardGame, String pokemonType, Integer pokedexNumber, String pokemonAbility) {
		super(cardName, cardImage, cardCategory, cardGame);
		type = pokemonType;
		pokedex = pokedexNumber;
		ability = pokemonAbility;
	}
	
	/**
	 * This mutator method initializes the field "type" of type String.
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * This mutator method initializes the field "pokedex" of the reference type Integer.
	 * @param pokedex
	 */
	public void setPokedex(Integer pokedex) {
		this.pokedex = pokedex;
	}
	
	/**
	 * This mutator method initializes the field "ability" of the String type.
	 * @param ability
	 */
	public void setAbility(String ability) {
		this.ability = ability;
	}
	
	/**
	 * This accessor method returns the field "type" of type String.
	 * @return
	 */
	public String getType() {
		return type;
	}

	/**
	 * This accessor method returns the field "pokedex" of type Integer.
	 * @return
	 */
	public Integer getPokedex() {
		return pokedex;
	}
	
	/**
	 * This accessor method returns the field "ability" of type String.
	 * @return
	 */
	public String getAbility() {
		return ability;
	}
	
	/**
	 * This overrided constructor returns a call to the superclass' toString() while returning the fields pokdex, type, and ability that refer to the pokemon character's description.
	 */
	@Override
	public String toString() {
		return super.toString() + ", " + pokedex + ", a " + type + "-type with " +  ability + " ability.";
	}
}
