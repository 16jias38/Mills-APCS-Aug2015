
/**
 * Write a description of class Equestria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Equestria
{
  public static void main(String[] args)
  {
      problemOne();
      problemTwo();
    }
    public static void problemOne()
    {
       distanceFromTo("Baltimore", "Manehattan");
       double displacement=distance(32, 16, 35, 9);
       System.out.println(displacement+" meters");
       distanceFromTo("Los Pegasus", "Neighagra Falls");
       displacement=distance(6, 19, 22, 7);
       System.out.println(displacement+" meters");
       distanceFromTo("Badlands", "Ponyville");
       displacement=distance(25, 23, 16, 13);
       System.out.println(displacement+" meters");
    }
    public static void problemTwo()
    {
        System.out.println("length of road trip around kingdom =  "+roadTrip(100)+" meters");
    }
    public static void problemThree()
    {
        
    }
    public static void distanceFromTo(String startDestination, String endDestination)
    {
        System.out.print("Distance from "+startDestination+" to "+endDestination+" = ");
    }
    public static double distance(int x1, int y1, int x2, int y2)
    {
        return Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
    }
    public static double roadTrip(double diameter)
    {
        return Math.PI*diameter;
    }
}