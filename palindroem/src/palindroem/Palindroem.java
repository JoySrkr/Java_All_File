/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindroem;

import java.util.Scanner;

/**
 *
 * @author joy
 */
public class Palindroem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String a, b="";
       System.out.printf("Enter The String you want to print");
       Scanner s= new Scanner(System.in);
       a=s.nextLine();
       int n=a.length();
       for(int i=n-1;i>=0;i--){
           b=b+a.charAt(i);
       }if(a.equalsIgnoreCase(b)){
           System.out.println("The String is Pallindrome");}
       else {
           System.out.println("The String is not Pallindroem");
       }
    }
    
}
