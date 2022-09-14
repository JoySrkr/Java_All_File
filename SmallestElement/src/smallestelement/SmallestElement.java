
package smallestelement;
import java.util.*;
public class SmallestElement {

    public static void main(String[] args) {
       Integer arr[] = new Integer[]{3,9,5,4,7,20,44};
  int k;
       System.out.println("Enter any number ");
       Scanner sc=new Scanner(System.in);
                          k=sc.nextInt();
  System.out.println("Original Array: ");
  System.out.println(Arrays.toString(arr));
  System.out.println(k + " smallest elements of the said array are:");
  Arrays.sort(arr);
  for (int i = 0; i < k; i++)
   System.out.print(arr[i] + " ");
    }
    
}
