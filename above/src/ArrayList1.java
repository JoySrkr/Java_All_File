/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> number =new ArrayList<Integer>();
        System.out.println("Size= "+number.size());
        
        number.add(10);
        number.add(20);
        number.add(40);
        
        System.out.println("ArrayList contains: "+number);
        System.out.println();
        System.out.println("Size = "+number.size());
        
        //Iterator itr=number.iterator();
       // while(itr.hasNext())
      //  {
            
       // }
       for(int x: number){
           System.out.println(" "+x);
       }
        System.out.println();
        System.out.println("size = "+number.size());
        
    }
}
