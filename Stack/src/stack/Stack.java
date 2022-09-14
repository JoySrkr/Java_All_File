
package stack;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class Stack {

    public static void main(String[] args) {
    String a,b ="";
    Scanner s= new Scanner(System.in);
    System.out.print("Enter the String you want to check: ");
    a=s.nextLine();
    int n=a.length();
    for(int i=n-1;i>=0;i--)
    {
        b=b+a.charAt(i);
    }
    if(a.equalsIgnoreCase(b)){
        System.out.println("The string is palindrome.");
    } else{
        System.out.println("The string is not palindrome.");
    }
}
}
