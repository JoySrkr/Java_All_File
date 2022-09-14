import java.util.*;
public class Reverse {
    public static void main(String[] args) {
     List<String> list_Strings = new ArrayList<String>();
  list_Strings.add("1");
  list_Strings.add("2");
  list_Strings.add("3");
  list_Strings.add("4");
  list_Strings.add("5");
  System.out.println("List before reversing :\n" + list_Strings);  
  Collections.reverse(list_Strings);
  System.out.println("List after reversing :\n" + list_Strings);  
    }
    
}
