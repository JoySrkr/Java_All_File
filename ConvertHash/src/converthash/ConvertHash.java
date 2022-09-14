
package converthash;
import java.util.*;
public class ConvertHash {

    public static void main(String[] args) {
      HashSet<String> h_set = new HashSet<String>();
      h_set.add("10");
          h_set.add("20");
          h_set.add("30");
          h_set.add("40");
          h_set.add("50");
          h_set.add("60");
      System.out.println("Original Hash Set: " + h_set);
       List<String> list = new ArrayList<String>(h_set);
        System.out.println("ArrayList contains: "+ list);
    }
    
}
