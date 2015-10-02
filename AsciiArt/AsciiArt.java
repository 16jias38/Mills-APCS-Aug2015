
/**
 * Write a description of class AsciiArt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AsciiArt
{
 public static void main(String[] args)
 {
     printTreeTop();
     printTreeTrunk();
    }
    public static void printTreeTop()
    {
        treeLeaves(1, 3, 58);
        treeLeaves(1, 11, 32);
        treeLeaves(2, 13, 29);
        treeLeaves(1, 14, 23);
        treeLeaves(1, 16, 19);
        treeLeaves(1, 18, 15);
        treeLeaves(4, 19, 13);
        treeLeaves(3, 22, 8);
        treeLeaves(1, 25, 0);
        treeLeaves(2, 26, 0);
        treeLeaves(2, 24, 6);
    }
    public static void printTreeTrunk()
    {
        System.out.println("                              wo             woodwoodwoodwood                      d");
        System.out.println("                               od              woodwoodwood                 woodwoo");
        System.out.println("                                woo            woodwoodwood         woodwood");
        System.out.print("                                   d");
        mainTreeTrunk(5, 12);
        System.out.print("                                    wood");
        mainTreeTrunk(3, 8);
        System.out.print("                                        woodwoo");
        mainTreeTrunk(3, 0);
        mainTreeTrunk(3, 47);
        mainTreeTrunk(3, 46);
        mainTreeTrunk(3, 46);
        mainTreeTrunk(4, 46);
    }
    public static void treeLeaves(int height, int width, int spaces)
    {
        for (int i=1; i<=height; i++)
        {
             for (int k=1; k<=spaces; k++)
            {
                System.out.print(" ");
            }
            System.out.print("|");
            for (int j=1; j<=width; j++)
            {
                System.out.print("leaf");
            }
            System.out.print("|");
            System.out.println();
        }
    }
    public static void mainTreeTrunk(int width, int spaces)
    {
        for (int i=1; i<=1; i++)
        {
             for (int k=1; k<=spaces; k++)
            {
                System.out.print(" ");
            }
            for (int j=1; j<=width; j++)
            {
                System.out.print("wood");
            }
            System.out.println();
        }
    }
}
