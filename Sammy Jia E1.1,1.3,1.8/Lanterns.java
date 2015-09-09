
/**
 * Exercise 14 of homework. Program may look weird due to google doc's formatting being different to BlueJ's.
 * 
 * Sammy Jia
 * Version 1.0 8/25/15
 */
public class Lanterns
{
    public static void main(String[] args)
    {
        drawPyramid();
        System.out.println();
        drawPyramid();
        drawLines();
        drawBottom();
        drawPyramid();
        System.out.println();
        drawPyramid();
        drawTop();
        drawLines();
        drawLines();
        drawTop();
        drawTop();
    }
    public static void drawPyramid()
    {
        drawTop();
        drawMiddle();
        drawBottom();
    }
    public static void drawTop()
    {
        System.out.println("    *****");
    }
    public static void drawMiddle()
    {
        System.out.println("  *********");
    }
    public static void drawBottom()
    {
        System.out.println("*************");
    }
    public static void drawLines()
    {
        System.out.println("* | | | | | *");
        //Spacing takes ups more space in BlueJ
    }
}
