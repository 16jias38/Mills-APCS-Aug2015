
/**
 * P1.3 of homework. Prints out part of the I Know an Old Lady song lyrics.
 * 
 * Sammy Jia 
 * Version 2.0 9/1/15
 */
public class OldLadySong
{
 public static void main(String[] args)
 {
     printIntroLine();
     System.out.println("fly");
     printDontKnowWhy();
     System.out.println("spider");
     System.out.println("That wriggled and wiggled and tiggled inside her");
     printSpiderToFly();
     System.out.println("bird");
     System.out.println("How absurd to swallow a bird");
     printBirdToSpider();
     System.out.println("cat");
     System.out.println("Fancy that to swallow a cat!");
     printCatToBird();
     System.out.println("horse");
     System.out.println("She's dead, of course!");
    }
    public static void printIntroLine()
    {
        System.out.print("There was an old lady who swallowed a ");
    }
    public static void printDontKnowWhy()
    {
        System.out.println("I don't know why she swallowed the fly");
        System.out.println("Perhaps she'll die");
        System.out.println();
        printIntroLine();
    }
    public static void printSpiderToFly()
    {
        System.out.println("She swallowed the spider to catch the fly");
        printDontKnowWhy();
    }
    public static void printBirdToSpider()
    {
        System.out.println("She swallowed the bird to catch the spider");
        printSpiderToFly();
    }
    public static void printCatToBird()
    {
        System.out.println("She swallowed the cat to catch the bird");
        printBirdToSpider();
    }
}
