 /**
 * Checkpoint three of the FracCalc project. Takes a fraction equation and outputs the answer.
 * 
 * Sammy Jia
 * Version 3.0 12/1/15
 */
import java.util.*;
public class FracCalc {
    public static void main(String[] args) 
    {
        //Reads the input from the user and calls produceAnswer with an equation
        Scanner console=new Scanner(System.in);
        String endReq=" ";
        //Allows the program to run for as long as the user wants
        while (!endReq.equals("quit")){
            System.out.print("Please insert your fraction-related equation: ");
            String input=console.nextLine();
            System.out.println(produceAnswer(input));
            System.out.print("Please insert 'quit' if you are done: ");
            endReq=console.nextLine();
        }
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    { 
        //Breaks up the string into an operator and operands, calls breakDown to break up operands,
        //calls math to do the math, and returns the final answer
        int index1=input.indexOf(" ");
        String operand1=input.substring(0, index1);
        int index2=input.indexOf(" ", index1+1);
        String operator=input.substring(index1+1, index2);
        int index3=input.length();
        String operand2=input.substring(index2+1, index3);
        int wholeNum1=breakDown(operand1, 1);  //Second parameter tells breakDown what to find
        int wholeNum2=breakDown(operand2, 1);  //1=whole number, 2=numerator, and 3=denominator
        int numerator1=breakDown(operand1, 2);
        int numerator2=breakDown(operand2, 2);
        int denominator1=breakDown(operand1, 3);
        int denominator2=breakDown(operand2, 3);
        return (math(wholeNum1, wholeNum2, numerator1, numerator2, denominator1, denominator2, operator));
    }
    public static int breakDown(String operand, int mod){
        //Breaks up the operand into its whole number, numerator, and/or denominator and returns said value
        int index1=operand.indexOf("_");
        int index2=operand.indexOf("/");
        int index3=operand.length();
        int result=0;
        if (index1!=-1){  //Sees if there is an underscore
            if (mod==1){
                result=Integer.parseInt(operand.substring(0, index1));
            }else if (mod==2){
                result=Integer.parseInt(operand.substring(index1+1, index2));
            }else if (mod==3){
                result=Integer.parseInt(operand.substring(index2+1, index3));
            }
        }else if (operand.indexOf("/")==-1){  //Sees if there is a slash
            if (mod==1){
                result=Integer.parseInt(operand);
            }else if (mod==3){
                result=1;
            }
        }else if (mod==2){
            result=Integer.parseInt(operand.substring(index1+1, index2));
        }else if (mod==3){
            result=Integer.parseInt(operand.substring(index2+1, index3));
        }
        return result;
    }
    public static String math(int wholeNum1, int wholeNum2, int numerator1, int numerator2, int denominator1,
                              int denominator2, String operator){
        //Does the actual math and returns the equation's answer
        if (wholeNum1>=0){  //Adds whole number to the fraction
            numerator1+=(wholeNum1*denominator1);
        }else{  //Ensures that whole numbers are correctly added to the fraction when negative
            numerator1=(wholeNum1*denominator1)-numerator1;
        }
         if (wholeNum2>=0){
            numerator2+=(wholeNum2*denominator2);
        }else{
            numerator2=(wholeNum2*denominator2)-numerator2;
        }
        int finalNumerator;
        int finalDenominator;
        if (operator.equals("+")||operator.equals("-")){  //Math for adding and subtracting done here
            if (denominator1!=denominator2){  //Preps the denominators
                numerator1*=denominator2;
                numerator2*=denominator1;
                finalDenominator=denominator1*denominator2;
            }else{
                finalDenominator=denominator1;
            }
            if (operator.equals("+")){
                finalNumerator=numerator1+numerator2;
            }else{
                finalNumerator=numerator1-numerator2;
            }
        }else{  //Math for multiplication and division done here
            if (operator.equals("/")){  //Flips second fraction when dividing
                int placeholder=numerator2;
                numerator2=denominator2;
                denominator2=placeholder;
            }
            finalNumerator=numerator1*numerator2;
            finalDenominator=denominator1*denominator2;
        }
        int finalWholeNum=finalNumerator/finalDenominator;  //Gets whole number out of fraction
        if (finalWholeNum<0){  //Removes negative sign from numerators and denominators when not needed
            finalNumerator=Math.abs(finalNumerator%finalDenominator);
            finalDenominator=Math.abs(finalDenominator);
        }else{
            finalNumerator=finalNumerator%finalDenominator;
        }
        int gcf=finalNumerator;
        int placeholder1=finalDenominator;
        while (placeholder1!=0){  //Finds the greatest common factor between numerator and denominator
            int placeholder2=placeholder1;
            placeholder1=gcf%placeholder1;
            gcf=placeholder2;
        }
        if (gcf!=1){  //Simplifies the fraction
            finalNumerator/=gcf;
            finalDenominator/=gcf;
        }
        String result=" ";
        if (finalNumerator==0){  //Checks if there is a fraction
            result=String.valueOf(finalWholeNum);
        }else if(finalWholeNum==0){  //Checks if there is a whole number
            result=(finalNumerator+"/"+finalDenominator);
        }else{
            result=(finalWholeNum+"_"+finalNumerator+"/"+finalDenominator);
        }
        return result;
    }
}
