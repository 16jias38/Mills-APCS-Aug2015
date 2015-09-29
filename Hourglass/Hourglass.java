
/**
 * P2.4 of homework. It prints out a picture of an hourglass.
 * 
 * Sammy Jia
 * Version 1.0 9/21/15
 */
public class Hourglass
{
  public static void main(String[] args)
  {
      printTop();
      printBottom();
    }
    public static void printTop()  //Prints the top half of the hourglass. Includes middle part.
    {
        printOutermostLine();
        for (int line=1; line<=4; line++)
        {
            for (int space=1; space<=line; space++)  //Creates spacing for each line.
            {
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int colons=4; colons>=line; colons--)  //Creates colons for each line.
            {
                System.out.print("::");
            }
            System.out.println("/");
        }
        System.out.println("     ||");
    }
    public static void printBottom()  //Prints the bottom half of the hourglass.
    {
        for (int line=4; line>=1; line--)
        {
            for (int space=1; space<=line; space++)  //Creates spacing for each line.
            {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int colons=4; colons>=line; colons--)  //Creates colons for each line.
            {
                System.out.print("::");
            }
            System.out.println("\\");
        } 
        printOutermostLine();
    }
    public static void printOutermostLine()  //Prints the first and last line of the hourglass.
    {
        System.out.print("|");
        for (int quotes=1; quotes<=10; quotes++)  //Creates ten quotation marks.
        {
            System.out.print("\"");
        }
        System.out.println("|");
    }
}
