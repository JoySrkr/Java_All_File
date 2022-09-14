
package newprojec;

import java.util.Arrays;
import java.util.Scanner;

public class NewProjec {

    public static void main(String[] args) {
     Integer arr[] = new Integer[]{1,48,29,2,77,43,3,56,5,98};
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter The num of Elements: ");
     int k=sc.nextInt();
     System.out.println("Original Array Is: ");
     System.out.println(Arrays.toString(arr));
     System.out.println(k+" sorts elements are: ");
     Arrays.sort(arr);
     for(int i=0;i<k;i++)
     {
         System.out.println(arr[i]+ "*");
     }
     
    }
    
}
