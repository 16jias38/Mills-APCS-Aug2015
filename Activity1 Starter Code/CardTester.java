/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card a=new Card("king", "diamonds", 10);
		Card b=new Card("ace", "spades", 20);
		Card c=new Card("four", "hearts", 1);
		Card b2=new Card("ace", "spades", 20);
		System.out.println(a.suit()+" "+a.rank()+" "+a.pointValue());
		System.out.println(b.suit()+" "+b.rank()+" "+b.pointValue());
		System.out.println(c.suit()+" "+c.rank()+" "+c.pointValue());
		System.out.println(b.matches(c));
		System.out.println(b.matches(b2));
	}
}
