
package fibonacci;
import java.util.Scanner;
public class Fibonacci {
public static int fibonacciRecursion(int n){
    if(n==0){
        return 0;
    }
    if(n==1 || n==2){
        return 1;
    }
    return fibonacciRecursion(n-2)+fibonacciRecursion(n-1);
}

    public static void main(String[] args) {
     int maxNumber;
     System.out.println("How many numbers you want in Fibonacci:");
	        Scanner scanner = new Scanner(System.in);
	        maxNumber = scanner.nextInt();
                System.out.print("Fibonacci Series of "+maxNumber+"number: ");
                for(int i=0;i<maxNumber;i++){
                    System.out.print(fibonacciRecursion(i)+" ");
                }
     
    }
    
}
