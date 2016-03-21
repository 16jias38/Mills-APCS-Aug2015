/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        String[] q={"king","a","b"};
        String[] w={"spades", "a"};
        int[] e={1,2,3};
        Deck a = new Deck(q, w, e);
        Deck b = new Deck(new String[]{"king", "queen"}, new String[]{"spades", "hearts"},
                          new int[]{1, 2});
        Deck c = new Deck(new String[]{"king", "queen", "jack"}, new String[]{"spades", "hearts",
                          "diamonds"}, new int[]{1, 2, 3});
        System.out.println(a.size()+" "+b.size()+" "+c.size());
        System.out.println(a.deal()+" "+b.deal()+" "+c.deal());
        System.out.println(a.isEmpty()+" "+b.isEmpty()+" "+c.isEmpty());
        System.out.println(a.size()+" "+b.size()+" "+c.size());
    }
}
