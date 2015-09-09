
/**
 * P1.1 of homework. It prints out mississippi as text art vertically.
 * 
 * Sammy Jia
 * Version 2.0 8/30/15
 */
public class Mississippi
{
 public static void main(String[] args)
 {
     printBigM();
     printBigI();
     printTwoBigS();
     printBigI();
     printTwoBigS();
     printBigI();
     printTwoBigP();
     printBigI();
    }
    public static void printTwoBigS()
    {
        printBigS();
        printBigS();
    }
    public static void printTwoBigP()
    {
        printBigP();
        printBigP();
    }
    public static void printBigM()
    {
        printDoubleM();
        System.out.println("MM   MM");
        System.out.println("M M M M");
        System.out.println("M  M  M");
        printBottomOfBigM();
    }
    public static void printBottomOfBigM()
    {
        printDoubleM();
        printDoubleM();
        printDoubleM();
    }
    public static void printBigI()
    {
        printManyI();
        printMiddleOfBigI();
        printManyI();
    }
    public static void printMiddleOfBigI()
    {
        printI();
        printI();
        printI();
        printI();
        printI();
    }
    public static void printBigS()
    {
        printManyS();
        printTwoS();
        System.out.println("S");
        printManyS();
        System.out.println("      S");
        printTwoS();
        printManyS();
    }
    public static void printBigP()
    {
        printManyP();
        printDoubleTwoP();
        printManyP();
        printBottomOfBigP();
    }
    public static void printDoubleTwoP()
    {
        printTwoP();
        printTwoP();
    }
    public static void printBottomOfBigP()
    {
        printP();
        printP();
        printP();
    }
    public static void printDoubleM()
    {
        System.out.println("M     M");
    }
    public static void printManyI()
    {
        System.out.println("IIIII");
    }
    public static void printI()
    {
        System.out.println("  I");
    }
    public static void printManyS()
    {
        System.out.println(" SSSSS");
    }
    public static void printTwoS()
    {
        System.out.println("S     S");
    }
    public static void printManyP()
    {
        System.out.println("PPPPPP");
    }
    public static void printTwoP()
    {
        System.out.println("P     P");
    }
    public static void printP()
    {
        System.out.println("P");
    }
}
