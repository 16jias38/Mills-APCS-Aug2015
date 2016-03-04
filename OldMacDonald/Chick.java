
/**
 * Write a description of class Chick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chick implements Animal
{
    private String myType;
    private String mySound1;
    private String mySound2;
    Chick(String type, String sound1){
        myType=type;
        mySound1=sound1;
    }
    Chick(String type, String sound1, String sound2){
        myType=type;
        mySound1=sound1;
        mySound2=sound2;
    }
    public String getSound(){
        if (Math.random()%2==0){
            return mySound1;
        }
        return mySound2;
    }
    public String getType(){
        return myType;
    }
}
