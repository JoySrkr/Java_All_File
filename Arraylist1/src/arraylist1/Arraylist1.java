
package arraylist1;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist1 {

    public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<>();
      list.add("Ravi");
      list.add("Vijay");
      list.add("Ravi");
      list.add("Ajay");
      Iterator itr = list.iterator();
      while(itr.hasNext()){
          System.out.println(itr.next());
      }
    }
    
}
