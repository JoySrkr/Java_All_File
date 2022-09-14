
package animal2;
public class Animal2 {
    void walk(){
        System.out.println("I am walking");
    }
    }
class Bird extends Animal2{
    void fly(){
        System.out.println("I am flying");
    }
    }
public class Solution{
    public static void main(String[]args){
        Bird bird=new Bird();
        bird.walk();
        bird.fly();
    }
    }
    
