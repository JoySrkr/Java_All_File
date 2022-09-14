/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist1;

/**
 *
 * @author joy
 */
public class StringSplit {
    public static void main(String[] args) {
        String s1="My Name is Randy Orthon";
        String s2="My Works Place is WWE";
        
       String rep= s2.replace("is", "LLL");
        System.out.println(rep);
        
       String []sp= s1.split("is");
       for(String x:sp){
        System.out.println(x);
       }
       
       StringBuffer sb=new StringBuffer("Joy");
        System.out.println(sb);
        
        sb.append(" Sarker");
        System.out.println(sb);
       int xp= sb.length();
        System.out.println(xp);
      sb.setLength(7);
        System.out.println("After Setting = "+sb);
        
        sb.delete(0, 5);
        System.out.println(sb);
        
        sb.reverse();
        System.out.println(sb);
        
        
        
        
       
       
    }
    
}
