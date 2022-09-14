/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithr;
class MultitheradingDemo2 implements Runnable {
    public void run(){
    try{
    System.out.println("Thread " + Thread.currentThread().getId()+ 
            " is running");
    
}catch(Exception e)
{
    System.out.println("Caught Exception");
}
} 
}  
   
public class MultiThr {
public static void main(String [] args){
    int n=4;
    for(int i=0;i<n;i++)
    {
       // MultithreadingDemo2 object
				//= new MultithreadingDemo2();
        Thread object = new Thread (new MultitheradingDemo2());
        object.start();
    }
}
    }
    
