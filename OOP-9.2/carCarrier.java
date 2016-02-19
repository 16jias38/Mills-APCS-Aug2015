
/**
 * Write a description of class carCarrier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class carCarrier extends Truck
{
    private int maxWeightLoadLb;
    /**
     * Constructor for objects of class carCarrier
     */
    public carCarrier(){
    }
    public carCarrier(String color, int currentMileage, int truckLengthFeet, int wheelDiameterInches, int maxWeightLoadLb){
        super(color, currentMileage, truckLengthFeet, wheelDiameterInches);
        this.maxWeightLoadLb=maxWeightLoadLb;
    }
    public void setMaxWeightLoadLb(int maxWeightLoadLb){
        this.maxWeightLoadLb=maxWeightLoadLb;
    }
    public int getMaxWeightLoadLb(){
        return this.maxWeightLoadLb;
    }
}
