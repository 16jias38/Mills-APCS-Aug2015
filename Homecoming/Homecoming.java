
/**
 * Chapter 3 Homecoming project. It prints out a person asking another out to homecoming and the expenses it entails. Individual costs are inputted by the user.
 * 
 * Sammy Jia
 * Version 1.0 10/17/15
 */
import java.util.*;
public class Homecoming
{
    //Scanner and my name are created here
    public static Scanner input=new Scanner(System.in);
    public static final String MYNAME="Sammy";
    //Calls the first exersize.
    public static void main(String[] args)
    {
        getADate();
    }
    //Prints out the first exersize. The output is a person asking another out to homecoming. Calls the second exersize.
    public static void getADate()
    {
        System.out.print("Hello. My name is "+MYNAME+".\nWhat's your name? ");
        String yourName=input.nextLine();
        System.out.println("\nNice to meet you "+yourName+".\n");
        System.out.println("Would you like to go to Homecoming with me?\n");
        System.out.println("Great! It'll be a magical night -- "+MYNAME+" and "+yourName+" are going to the Mills Homecoming Dance of 2015!");
        damage(yourName);
    }
    //Prints out the second exersize. It prompts the user for individual expenses and tells the user the total expense. Calls the third exersize and passes variables.
    public static void damage(String yourName)
    {
        System.out.println("\nLet's figure out the damage for the evening.\n");
        System.out.println("What are your estimated costs?");
        System.out.print("Tickets(per person): ");
        double tickets$=input.nextDouble(); //The weird-looking symbol that is at the end of each variable name is a dollar sign. It stands for money or cost.
        System.out.print("Flowers(total for both of you): ");
        double flowers$=input.nextDouble();
        System.out.print("Pictures: ");
        double pictures$=input.nextDouble();
        System.out.print("Dinner(per person): ");
        double dinner$=input.nextDouble();
        System.out.print("New clothes: ");
        double clothes$=input.nextDouble();
        System.out.print("Other expenses: ");
        double other$=input.nextDouble();
        double totalExpense=(int)(100*((2*dinner$+clothes$)*1.0825+2*tickets$+flowers$+pictures$+other$))/100.0;
        System.out.println("\nIncluding tax, you should expect to spend "+totalExpense+" dollars.");
        System.out.println("If you split the costs with your date, each will pay "+totalExpense/2+" dollars.");
        statsTable(yourName, tickets$, flowers$, pictures$, dinner$, clothes$, other$, totalExpense);
    }
    //Prints out the third exersize. The output is a cleaner and more detailed set of expenses that has been formatted into a table.
    public static void statsTable(String yourName,double tickets$,double flowers$,double pictures$,double dinner$,double clothes$,double other$,double totalExpense)
    {
        System.out.println("\nMHS Homecoming 2015");
        System.out.println(MYNAME+" and "+yourName+"\n");
        System.out.println("Tickets(Total): "+tickets$*2);
        System.out.println("Flowers(Total): "+flowers$);
        System.out.println("Pictures:       "+pictures$);
        System.out.println("Dinner(Total):  "+dinner$*2);
        System.out.println("New clothes:    "+clothes$);
        System.out.println("Other expenses: "+other$+"\n");
        double subtotal=(int)(100*(2*(dinner$+tickets$)+flowers$+pictures$+clothes$+other$))/100.0;
        System.out.println("       Subtotal "+subtotal);
        System.out.println("      Sales tax "+(int)(100*((2*dinner$+clothes$)*0.0825))/100.0);
        System.out.println("          Total "+totalExpense);
    }
}
