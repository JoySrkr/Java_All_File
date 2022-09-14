
package test2;
class Vehicle
{
    int maxSpeed =120;
}
/* sub class Car extending vehicle */

class Car extends Vehicle
{
    int maxSpeed =180;
    void display()
    {
        /*print maxSpeed of base class (Vehicle)*/
        System.out.println("Maximum Speed: "+ super.maxSpeed);
    }
}
class Test 
{
    public static void main(String[] args)
    {
        Car small = new Car();
        small.display();
    }
}
