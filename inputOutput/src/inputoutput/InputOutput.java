
package inputoutput;

import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        
     Scanner input = new Scanner(System.in);
     
     System.out.print("Enter float: ");
     float myFloat = input.nextFloat();
     System.out.print("Float entered = " + myFloat);
     
     System.out.print("Enter double: ");
     double myDouble = input.nextDouble();
     System.out.println("Double entered = " + myDouble);
     System.out.print("Enter text: ");
     String myString= input.next();
     System.out.println("Text entered = " + myString);
    
}
}
