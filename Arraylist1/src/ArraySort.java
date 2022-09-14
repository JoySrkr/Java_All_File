
import java.util.ArrayList;
import java.util.Collections;

public class ArraySort {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<Integer>();
        num.add(50);
        num.add(20);
        num.add(40);
        num.add(10);
        num.add(4,70);
        num.add(5,15);
        System.out.println(num);
        Collections.sort(num);
        System.out.println(num);
        
        String s1="Anis Islam";
        String s2=new String("anis Islam");
        
        System.out.println(s1+", "+s2);
        int ln=s1.length();
        System.out.println(ln);
        
        if(s1.contains(s2)){
            System.out.println("Equals");
            
        }else{
            System.out.println("Not equals");
        }
        
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Equals");
            
        }else{
            System.out.println("Not Equals");
        }
        boolean n=s1.contains("Anis");
        System.out.println(n);
        
       boolean pri=s1.isEmpty();
        System.out.println(pri);
        int s4=s1.indexOf("i");
        System.out.println(s4);
        int leng=s1.length();
        System.out.println(leng);
        
    }
}
