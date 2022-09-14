
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Foreach {

    public static void main(String[] args) {
        int num[] = {20, 30, 40};
        System.out.println(num.length);
        for (int x : num) {
            System.out.println(x);
        }
        
        ArrayList<Integer> num1 = new ArrayList<Integer>();
        ArrayList<Integer> num2 = new ArrayList<Integer>();
        ArrayList<Integer> num3 = new ArrayList<Integer>();

        num1.add(10);
        num1.add(20);
        num1.add(30);
        num1.add(40);
        num1.add(50);
        num1.add(5, 60);
        num1.add(6, 70);
        num1.add(7, 80);

        System.out.println(num1);
        System.out.println(num1.size());

        num2.add(1);
        num2.add(2);
        num2.add(3);
        num2.add(4);
        num2.add(5);
        num2.add(5, 6);
        num2.add(6, 7);

        System.out.println(num2);
        System.out.println(num2.size());
        
        num2.remove(5);
        System.out.println(num2);
        
        num2.removeAll(num2);
        System.out.println("Num 2 Value: "+num2);
        
        
        num3.addAll(num1);
        boolean chk=num3.equals(num1);
        System.out.println(chk);
        
        boolean y=num1.contains(70);
        System.out.println(y);
        
        boolean z=num1.contains(70);
        System.out.println(z);
        
        int p=num1.indexOf(30);
        System.out.println(p);
        
       boolean s=num2.isEmpty();
        System.out.println(s);
        
        num1.set(2, 100);
        System.out.println(num1);
        
        Iterator itr=num1.iterator();
        while(itr.hasNext()){
            System.out.println(" "+itr.next());    
        }
        
        int a=num1.get(3);
        System.out.println(a);
        
        Collections.sort(num1);
        System.out.println("Sorting Accending Order"+num1);
        
    }
}
