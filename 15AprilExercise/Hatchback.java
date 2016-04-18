
/**
 * Write a description of class Hatchback here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hatchback extends Car
{
    private int numDoors;
    public Hatchback(String color, int year, String make, int numDoors){
        super (color, year, make);
        this.numDoors=numDoors;
    }
    public String toString(){
        String output=super.toString()+" Doors: "+numDoors;
        return output;
    }
    public int getNumDoors(){
        return numDoors;
    }
}
