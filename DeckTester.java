/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *    @param args is not used.
     */
    public static void main(String[] args) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
        Deck deck = new Deck(new String[]{"Jack", "Queen", "King"},
                             new String[]{"clubs", "diamonds"},
                             new int[]{5, 10, 15});
        System.out.println(deck);
    
    }
}
