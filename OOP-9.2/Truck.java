
/**
 * Write a description of class Truck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Truck extends Vehicles
{
    // instance variables - replace the example below with your own
    private int truckLengthFeet;
    private int wheelDiameterInches;
    /**
     * Constructor for objects of class Truck
     */
    public Truck(){
    }
    public Truck(String color, int currentMileage, int truckLengthFeet, int wheelDiameterInches){
        super(color, currentMileage);
        this.truckLengthFeet=truckLengthFeet;
        this.wheelDiameterInches=wheelDiameterInches;
    }
    public void setTruckLengthFeet(int truckLengthFeet){
        this.truckLengthFeet=truckLengthFeet;
    }
    public void setWheelDiameterInches(int wheelDiameterInches){
        this.wheelDiameterInches=wheelDiameterInches;
    }
    public void printTruckLengthFeet(){
        System.out.println("Your truck is "+this.truckLengthFeet+" feet long.");
    }
    public void printWheelDiameterInches(){
        System.out.println("Your wheels have a diameter of "+this.wheelDiameterInches+" inches.");
    }
    public void changeOil(){
        if (this.getCurrentMileage() - this.getLastOilChange() > 15000){
            System.out.println("Hey buddy, time to change your oil");
            this.setLastOilChange(this.getCurrentMileage());
        }
    }
    public String toString(){
        return "wheel diameter: "+wheelDiameterInches+" inches\ntruck length: "+truckLengthFeet+" feet";
    }
}
