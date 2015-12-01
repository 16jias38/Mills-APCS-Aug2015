
/**
 * P3.1 of the homework. Prints out two Christmas trees with nested for loops and parameters.
 * 
 * Sammy Jia
 * Version 1.0 9/29/15
 */
public class ChristmasTree
{
   public static void main(String[] args)
   {
       tree(3, 4);
       tree(2, 5);
    }
    //Prints tree. 1st int gives number of segments and 2nd int gives height of segment.
    public static void tree(int treeTopSegments, int heightOfSegment)
    {
        //Prints treetops. widthMod is used later on to modify the width limit of the lines.
        for (int widthMod=0; widthMod<treeTopSegments; widthMod++)
        {
            //widthLimit helps set the width limit of a line
            for (int widthLimit=1; widthLimit<=heightOfSegment; widthLimit++)
            {
                //Prints spaces for tree
                for (int spaces=1; spaces<=6-(widthLimit+widthMod); spaces++)
                {
                    System.out.print(" ");
                }
                //Prints stars for tree
                for (int stars=1; stars<=2*(widthLimit+widthMod)-1; stars++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        printTreeBase();
    }
    //Prints the base of the tree
    public static void printTreeBase()
    {
        System.out.println("     *\n     *");
        System.out.println("  *******");
    }
}
