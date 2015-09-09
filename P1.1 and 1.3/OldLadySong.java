
/**
 * P1.3 of homework.
 * 
 * Sammy Jia 
 * Version 1.0 8/26/15
 */
public class OldLadySong
{
 public static void main(String[] args)
 {
     printIntroLine();
     System.out.println("fly");
     printDontKnowWhy();
     printIntroLine();
     System.out.println("spider");
     System.out.println("That wriggled and wiggled and tiggled inside her");
     printSpiderToFly();
     printIntroLine();
     System.out.println("bird");
     System.out.println("How absurd to swallow a bird");
     printBirdToSpider();
     printIntroLine();
     System.out.println("cat");
     System.out.println("Fancy that to swallow a cat!");
     printCatToBird();
     printIntroLine();
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
