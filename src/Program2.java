/**
 * Program 1
 *  This program created one base class called TradingCard that is extended by a child class GamingCard. GamingCard acts as both a child and a superclass by having a child class PokemonCard implement
 *  its methods and fields similar to how GamingCard inherits TradingCards' public class members. This program utilizes inheritance and polymorphism. The result displays each object associated with each class and their respective fields.
 *  CS160-3
 *  2/19/22
 *  @author  Cameron Cobb
 * 
 */
public class Program2 {

	public static void main(String[] args) {
		TradingCard tc = new TradingCard("General", "gen.img");

		GamingCard gc = new GamingCard("Game Name", "gc.img", "gaming", "Pokemon");

		PokemonCard charmeleon = new PokemonCard("Charmeleon", "p004.img", "gaming", "Pokemon", "fire", 4, "blaze");
		PokemonCard beedrill = new PokemonCard("Beedrill", "p015.img", "gaming", "Pokemon", "bug/poison", 15, "swarm or sniper");
		PokemonCard clefairy = new PokemonCard("Clefairy", "p035.img", "gaming", "Pokemon", "normal", 35, "friend guard");


		TradingCard[ ] cards = new TradingCard[5];

		cards[0] = tc;
		cards[1] = gc;
		cards[2] = charmeleon;
		cards[3] = beedrill;
		cards[4] = clefairy;

		for ( TradingCard card : cards )
		   System.out.println(card);
		

	}

}
