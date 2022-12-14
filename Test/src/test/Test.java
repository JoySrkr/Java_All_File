
package test;
class Bicycle{
    //the Bicycle Class has tow fields
    public int gear;
    public int speed;
    //the bicycle has one constructor
    public Bicycle(int gear,int speed)
    {
       this.gear=gear;
       this.speed=speed;
    }
    //the Bicycle class has three methods
    public void applyBreak(int decrement)
    {
        speed -= decrement;
    }
    public void speedUp(int increment)
    {
        speed += increment;
    }
    //toString() method to print info of Bicycle
    public String toString()
    {
        return ("No of gears are "+gear+"\n"
                +"speed of bicycle is "+speed);
    }
}

//derived class
class MountainBike extends Bicycle {
  public int seatHeight; 

    public MountainBike(int gear, int speed,int startHeight) {
        //invoking base-class(Bicycle) constructor
        super(gear, speed);
        seatHeight = startHeight;
    }
    //the MountainBike subclass adds one more method
    public void seatHeight(int newValue)
    {
        seatHeight = newValue;
    }
    //overriding toString() method
    //of Bicycle to print more info
  @Override
    public String toString()
    {
        return (super.toString()+"\nseat height is "+ seatHeight);
    }
}
//driver class
public class Test {

    public static void main(String[] args) {
        MountainBike mb= new MountainBike(3,100,25);
        System.out.println(mb.toString());
      
    }
    
}
