/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superconstuuctor;
class Person
{
    Person()
    {
        System.out.println("Person class Constructor");
    }
}
  
/* subclass Student extending the Person class */
class Student extends Person
{
    Student()
    {
        // invoke or call parent class constructor
        super();
  
        System.out.println("Student class Constructor");
    }
}
public class Superconstuuctor {

    public static void main(String[] args) {
        Student s = new Student();
    }
    
}
