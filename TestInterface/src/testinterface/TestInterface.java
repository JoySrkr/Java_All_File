/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinterface;

/**
 *
 * @author joy
 */
interface Printable{
    void print();
}
interface Showable extends Printable{
    void show();
}
public class TestInterface implements Showable {

    public void print(){
        System.out.println("Hello");
        
    }
    public void show(){
          System.out.println("Welcome");  
        }
    public static void main(String[] args) {
        TestInterface obj = new TestInterface();
        obj.print();
        obj.show();
        obj.print();
        
    }
    
}
