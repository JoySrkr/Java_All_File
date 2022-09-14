/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testabstraction2;

/**
 *
 * @author joy
 */
abstract class Bike{
    Bike(){
        System.out.println("bike is created");
    }
    abstract void run();
    void chageGear(){
        System.out.println("gear chaged");
    }
}
class Honda extends Bike{
    void run(){
        System.out.println("Running safely:.......");
    }
}
 class TestAbstraction2 {

    public static void main(String[] args) {
        Bike obj = new Honda();
        obj.run();
        obj.chageGear();
    }
    
}
