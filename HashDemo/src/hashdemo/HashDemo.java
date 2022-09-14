/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashdemo;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashDemo {

    public static void main(String[] args) {
     Hashtable<String,Integer>ht = new Hashtable<String,Integer>();
     ht.put("a",new Integer(20));
     ht.put("b",new Integer(30));
     ht.put("c",new Integer(40));
     ht.put("d",new Integer(50));
     
     Set st = ht.entrySet();
     Iterator itr =st.iterator();
     while(itr.hasNext()){
         Map.Entry m =(Map.Entry) itr.next();
         System.out.println(m.getKey()+"="+m.getValue());
      }
      
    }
    
}
