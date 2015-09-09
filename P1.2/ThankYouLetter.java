
/**
 * P1.2 of homework. The program consists of three wedding thank you letters.
 * 
 * Sammy, Theodore
 * Version 2.0 8/30/15
 */
public class ThankYouLetter
{
  public static void main(String[] args)
  {
      printDear();
      System.out.println("mother,");
      printThankYou();
      System.out.println("      We're very happy over the goat that you");
      System.out.println("gifted us. It was very thoughful of you. We'll");
      System.out.println("make sure to milk her as soon as possible.");
      printSincerely();
      printDear();
      System.out.println("cousin Jim,");
      printThankYou();
      System.out.println("      We are grateful for the homemade pies that");
      System.out.println("you've given us. I know just how prideful you are");
      System.out.println("of these pies. We'll be sure to relish them later");
      System.out.println("in the day.");
      printSincerely();
      printDear();
      System.out.println("aunt Polly,");
      printThankYou();
      System.out.println("      Thanks so much for the box of crackers. It");
      System.out.println("must have been hard for you to gift your favorite");
      System.out.println("snack. Come over some day and we can eat it");
       System.out.println("together.");
      printSincerely();
    }
    public static void printDear()
    {
        System.out.print("Dear ");
    }
    public static void printThankYou()
    {
        System.out.println();
        System.out.println("      Thank you for coming to our wedding. It");
        System.out.println("made us so happy to see you there. The wedding");
        System.out.println("wouldn't have been the same without you.");
        System.out.println();
    }
    public static void printSincerely()
    {
        System.out.println();
        System.out.println("Sincerely,");
        System.out.println("Mr. and Mrs. Foo");
        System.out.println();
    }
}
