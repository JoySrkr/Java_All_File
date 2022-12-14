/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finallyblock;


class UserDefinedExcep extends Exception{
   String str1;
   /* Constructor of custom exception class
    * here I am copying the message that we are passing while
    * throwing the exception to a string and then displaying 
    * that string along with the message.
    */
   UserDefinedExcep(String str2) {
	str1=str2;
   }
   public String toString(){ 
	return ("MyException Occurred: "+str1) ;
   }
}

public class Example1{
   public static void main(String args[]){
	try{
		System.out.println("Starting of try block");
		// I'm throwing the custom exception using throw
		throw new UserDefinedExcep("This is My error Message");
	}
	catch(UserDefinedExcep exp){
		System.out.println("Catch Block") ;
		System.out.println(exp) ;
	}
   }
}