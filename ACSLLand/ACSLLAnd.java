
/**
 * Write a description of class ACSLLAnd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class ACSLLAnd
{
   public static void main(String[] args){
       Scanner input=new Scanner(System.in);
       System.out.print("Please insert all of the game's rolls: ");
       String stringOfRolls=input.nextLine();
       InputProcessor translator=new InputProcessor();
       translator.processRolls(stringOfRolls);
   }
}
class InputProcessor
{
    private String input;
    Player playerA=new Player();
    Player playerB=new Player();
    public void processRolls(String input){
        int previousIndex=0;
        int currentIndex=input.indexOf(",");
        int onOffSwitch=0;
        while (currentIndex<input.length()){
            int roll=Integer.parseInt(input.substring(previousIndex, currentIndex));
            if (onOffSwitch==0){
                playerA.changePosition(roll);
                onOffSwitch=1;
            }else{
                playerB.changePosition(roll);
                onOffSwitch=0;
            }
            previousIndex=currentIndex;
            currentIndex=input.indexOf(",",currentIndex+1); //can simplify
        }
    }
}
class Player
{
    private int cellPosition=0;
    public void changePosition(int roll){
        if (roll==4||roll==6){
            roll=0-roll;
        }
        cellPosition+=roll;
    }
}
