
package demo;


public class Demo {

    public static void main(String[] args) {
       int i,temp,j;
       int arr[]={6,5,10,30,15,70,12};
       for(i=1;i<arr.length;i++)
       {
           temp=arr[i];
           j=i;
           while(j>0 && arr[j-1]>temp)
           {
               arr[j]=arr[j-1];
               j=j-1;
               
           }
           arr[j]=temp;
       }
        for(i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
