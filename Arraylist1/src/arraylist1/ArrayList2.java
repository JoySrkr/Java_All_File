/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {
    public static void main(String[] args) {
       int []arr={1,3,4,5,6,7,8};
        System.out.println("Array Size: "+arr.length);
        
        for(int x:arr){
            System.out.println(x);
        }
        System.out.println("Array Size: "+arr.length);
        
        ArrayList<Integer> num=new ArrayList<Integer>();
        System.out.println(num.size());
        
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(4,50);
        num.add(5,60);
        System.out.println(num);
       Iterator itr=num.iterator();
       while(itr.hasNext()){
           System.out.print(" "+itr.next());
       }
        for(int x:num){
            System.out.println(x);
        }
        System.out.println(num.size());
        
        num.remove(4);
        System.out.println("After removing"+num);
        
        ArrayList<Integer> num1=new ArrayList<Integer>();
    ArrayList<Integer> num2=new ArrayList<Integer>();
    ArrayList<Integer> num3=new ArrayList<Integer>();
    
    
    num1.add(10);
    num1.add(20);
    num1.add(30);
    num1.add(40);
    System.out.println("The Elements are : "+num1);
    
    num2.add(1);
    num2.add(2);
    num2.add(3);
    num2.add(4);
    
    System.out.println("The Elements of num1 : "+num2);
    
    num3.addAll(num1);
    System.out.println("The Elements add in Num3: "+num3);
    
    boolean x=num3.equals(num1);
        System.out.println(" "+x);
        
        int y=num1.indexOf(20);
        System.out.println(y);
        
       int z= num1.indexOf(30);
        System.out.println(z);
        
        int p=num1.indexOf(40);
        System.out.println(p);
        
        boolean a=num1.contains(30);
        System.out.println(a);
        
        num1.set(1,90);
        System.out.println(num1);
        
       // num1.removeAll(num1);
       num1.clear();
        boolean b=num1.isEmpty();
        System.out.println("There have Elements: "+b);
        System.out.println(num1);
        
        
        
    }
}
