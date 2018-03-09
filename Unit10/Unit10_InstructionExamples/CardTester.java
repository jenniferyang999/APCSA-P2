/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card = new Card("Jack","Club",11);
		Card card1 = new Card("9","Heart",9);
		Card card2 = new Card("Jack","Club",11);
		
		System.out.println("card: " + card);
		System.out.println("card1: " + card1);
		System.out.println("card2: " + card2);
		System.out.println("");
		System.out.println("card matches card1: " + card.matches(card1));
		System.out.println("card matches card2: " + card.matches(card2));
	}
}
