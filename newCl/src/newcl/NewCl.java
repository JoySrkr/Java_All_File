
package newcl;

import java.util.Arrays;
import java.util.Scanner;

public class NewCl {

    public static void main(String[] args) {
       Integer arr[]=new Integer[]{30,2,32,44,65,9,67,3,54,1,88,64,8};
       Scanner sc = new Scanner(System.in);
       int k=sc.nextInt();
       System.out.println("Original array Is: ");
       System.out.println(Arrays.toString(arr));
       System.out.println(k+ " Sorts elimints are");
       Arrays.sort(arr);
       for(int i=0;i<k;i++)
       {
           System.out.println(arr[i]+" ");
       }
    }
    
}
