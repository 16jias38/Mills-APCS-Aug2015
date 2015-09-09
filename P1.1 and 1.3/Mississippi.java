
/**
 * P1.1 of homework.
 * 
 * Sammy Jia
 * Version 1.0 8/26/15
 */
public class Mississippi
{
 public static void main(String[] args)
 {
     printBigM();
     printBigI();
     printBigS();
     printBigS();
     printBigI();
     printBigS();
     printBigS();
     printBigI();
     printBigP();
     printBigP();
     printBigI();
    }
    public static void printBigM()
    {
        printDoubleM();
        System.out.println("MM   MM");
        System.out.println("M M M M");
        System.out.println("M  M  M");
        printDoubleM();
        printDoubleM();
        printDoubleM();
    }
    public static void printBigI()
    {
        printManyI();
        printI();
        printI();
        printI();
        printI();
        printI();
        printManyI();
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
        printTwoP();
        printTwoP();
        printManyP();
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
