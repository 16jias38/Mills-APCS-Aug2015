
/**
 * Accepts any amount of numbers and prints out the maximum, minimum, sum of all even numbers, and maximum of all even numbers.
 * 
 * Sammy Jia
 * Version 1.0 11/6/15
 */
import java.util.*;
public class ProcessingNumbers
{
   public static void main(String[] args)
   {
      Scanner console=new Scanner(System.in);
      System.out.print("How many numbers do you want? ");  //Sets how many numbers that the user will input.
      int maxCount=console.nextInt();
      computation(maxCount, console);
   }
   //All mathematics and processing is done here.
   public static void computation(int maxCount, Scanner console)
   {
      if (maxCount>0){  //The program will end if the user tells the computer that he or she doesn't want to input a number.
         System.out.print("What is the first number? ");
         double max=number1;  //First number is used as frame of reference for min and max.
         double min=number1;
         double sumEven=0;
         double maxEven=0;
         for (int count=2; count<=maxCount; count++)  //Asks for and recieves inputs for the second number onwards.
         {
            System.out.print("What is the next number? ");
            double number=console.nextDouble();
            if (number>max){  //Compares number with current max. The greater number becomes the new max.
               max=number;
            }else if (number<min){  //Compares number with current min. The smaller number becomes the new min.
               min=number;
            }
            if (number1%2==0&&sumEven==0&&maxEven==0){  //Checks if first number is even. Second and third test assures that the if statement cannot be true more than once.
               sumEven+=number1;
               maxEven=number1;
            }
            if (number%2==0){  //Checks if second number onwards is even.
               sumEven+=number;
               if (maxEven==0||number>maxEven){  //Checks if second number onwards is the maximum for even numbers.
                  maxEven=number;
               }
            }
         }
         //The results are printed out here.
         System.out.println("\nThe maximum is "+max+".");
         System.out.println("The minimum is "+min+".");
         System.out.println("The sum of all even numbers is "+sumEven+".");
         System.out.println("The maximum of all even numbers is "+maxEven+".");
      }
   }
}

