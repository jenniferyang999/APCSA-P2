/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		String[] suits = {"Club", "Diamond", "Heart", "Spade"};
		int[] pointValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		Deck test = new Deck(ranks, suits, pointValues);
		test.deal();
		test.deal();
		System.out.print(test.toString());
		
		String[] animals = {"Giraffe", "Lion", "Cheetah", "Starfish", "Pelican"};
		String[] states = {"Sleeping", "Eating", "Moving"};
		int[] numbofAnimals = {6, 12, 3, 45, 32};
		Deck test1 = new Deck(animals, states, numbofAnimals);
		test1.deal();
		test1.deal();
		System.out.print(test1.toString());
		
	}
}
