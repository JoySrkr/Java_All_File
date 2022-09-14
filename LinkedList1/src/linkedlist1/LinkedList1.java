
package linkedlist1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

    public static void main(String[] args) {
     LinkedList<String> a1 = new LinkedList<String>();
     a1.add("Ravi");
     a1.add("Vijay");
     a1.add("Ravi");
     a1.add("Ajay");
     Iterator<String> itr =a1.iterator();
     while(itr.hasNext()){
         System.out.println(itr.next());
     }
     
    }
    
}
