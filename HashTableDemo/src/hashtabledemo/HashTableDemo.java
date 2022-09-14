
package hashtabledemo;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {

    public static void main(String[] args) {
       Hashtable<String,Integer>ht = new Hashtable<>();
       ht.put("a", new Integer(10));
       ht.put("b",new Integer(20));
       ht.put("c",new Integer(30));
       ht.put("d",new Integer(40));
       
       Set st = ht.entrySet();
       Iterator itr = st.iterator();
       while(itr.hasNext()){
           Map.Entry m = (Map.Entry) itr.next();
           System.out.println(m.getKey()+ " "+m.getValue());
       }
    }
    
}
