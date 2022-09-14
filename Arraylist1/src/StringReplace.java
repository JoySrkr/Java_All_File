/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
public class StringReplace {
    public static void main(String[] args) {
        String s1="This i    s a pen";
        
        System.out.println(s1);
        
       String x= s1.replace("i","j");
        System.out.println(x);
        
       String [] s3=s1.split("    s");
       for(String p: s3){
           System.out.println(p);
       }
    }
    
}
