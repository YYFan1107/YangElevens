/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        Card card1 = new Card("Jack", "Spade", 11);
        Card card2 = new Card("3", "Diamonds", 3);
        Card card3 = new Card("Jack", "Spade", 11);
        System.out.println(card1.matches(card3));
        System.out.println(card1);
    }
}