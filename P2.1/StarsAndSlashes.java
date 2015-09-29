
/**
 * P2.1 of homework. Prints out a picture consisting of stars and slashes by using a nested loop.
 * 
 * Sammy Jia
 * Version 1.0 9/22/15
 */
public class StarsAndSlashes
{
   public static void main(String[] args)
   {
       for (int line=1; line<=7; line++)  //Sets the line that the program works on.
       {
           for (int stars=1; stars<=(7-line);stars++)  //Prints out stars on left side.
           {
               System.out.print("*");
            }
           for (int spaces=1; spaces<=line;spaces++)  //Prints out spaces on the left side.
           {
               System.out.print(" ");
            }
            for (int forwardSlash=1; forwardSlash<=(7-line);forwardSlash++)  
            //Prints out forward slashes in the middle of the picture.
           {
               System.out.print("//");
            }
            for (int backSlash=1; backSlash<=line-1;backSlash++)
            //Prints out back slashes in the middle of the picture.
           {
               System.out.print("\\\\");
            }
            for (int spaces=1; spaces<=line;spaces++)  //Prints out spaces on the right side.
           {
               System.out.print(" ");
            }
            for (int stars=1; stars<=(7-line);stars++)  //Prints out stars on right side.
           {
               System.out.print("*");
            }
            System.out.println();
        }
    }      
}
