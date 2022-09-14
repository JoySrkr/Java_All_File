/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concreat.pkgclass;

/**
 *
 * @author joy
*/
abstract class DemoAbstractClass {
    abstract void display();
}

public class ConcreatClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     DemoAbstractClass AC= new DemoAbstractClass(){
         void display()
         {
System.out.println("Hi.");
         }
     };
AC.display();
System.out.println("How are you?");// TODO code application logic here
    }
    
}
