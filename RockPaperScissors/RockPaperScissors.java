
/**
 * The program runs a rudimentary rock paper scissors game. Users set how long the game is and input their choice. Afterwards, the result is printed out.
 * 
 * Sammy Jia and Theodore Lee Chow 
 * Version 1.0 11/17/15
 */
import java.util.*;
public class RockPaperScissors
{
    public static void main(String[] args){
        Scanner console=new Scanner(System.in);
        System.out.print("How many times will you play? ");  //Prompts how long the game will be.
        int timesToPlay=Integer.parseInt(console.nextLine());  //Parse is needed to prevent the first nextLine(); in the 'game' method from being skipped.
        System.out.println();
        game(timesToPlay, console);  //Method call to actual game.
    }
    public static void game(int timesToPlay, Scanner console){  //Actual rock paper scissors game is held here.
        int timesPlayed=0;
        int timesLost=0;
        int timesWon=0;
        while(timesPlayed<timesToPlay){  //Makes sure that you play the correct amount of rounds.
            timesPlayed++;
            System.out.print("Rock, paper, or scissors? The word must be lowercased. ");  //Prompts user to input his or her choice.
            String userChoice=console.nextLine();
            Random randomNum=new Random();  
            int compChoice=randomNum.nextInt(3);  //Computer randomly chooses. 0 is rock, 1 is paper, and 2 is scissors.
            if(compChoice==0&&userChoice.equals("rock")||compChoice==1&&userChoice.equals("paper")||  //If else statements here decide the round's result.
                compChoice==2&&userChoice.equals("scissors")){   
                System.out.println("You tied with the computer.");
            }else if(compChoice==0&&userChoice.equals("paper")||compChoice==1&&userChoice.equals("scissors")||
                     compChoice==2&&userChoice.equals("rock")){
                System.out.println("Congratulations! You won!");
                timesWon++;
            }else if(compChoice==0&&userChoice.equals("scissors")||compChoice==1&&userChoice.equals("rock")||  //Not an else to prevent it from printing if user doesn't input rock, paper, or scissors.
                     compChoice==2&&userChoice.equals("paper")){
                System.out.println("Sorry, you lost. Better luck next time.");
                timesLost++;
            }
            System.out.println();
        }
        if(timesWon>timesLost){  //If else statements here decide the game's result.
                System.out.println("You won the game.");
            }else if(timesWon<timesLost){
                System.out.println("You lost the game.");
            }else if(timesWon==timesLost&&timesWon!=0){  //Not an else to prevent it from printing if user doesn't input rock, paper, or scissors
                System.out.println("Neither won the game.");
            }
    }
}
