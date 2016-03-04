
/**
 * Write a description of class Pig here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pig implements Animal
{
    private String myType;
    private String mySound;
    Pig(String type, String sound){
        myType=type;
        mySound=sound;
    }
    public String getSound(){
        return mySound;
    }
    public String getType(){
        return myType;
    }
}
