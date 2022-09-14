/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemo;

import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadTDemo extends Thread{
    private Thread t;
    private String threadName;
    ThreadTDemo(String name){
        threadName = name;
        System.out.println("Creating" + threadName);
    }
    public void run(){
        System.out.println("Running"+threadName);
        try{
            for(int i= 4;i>0;i--)
            {
                System.out.println("Thread: "+threadName + ", "+i);
                Thread.sleep(50);
            }
        } catch (InterruptedException ex) {
            System.out.println("Thread " + threadName + " interrupted, ");
//Logger.getLogger(ThreadTDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Thread " + threadName + "exiting, ");
    }
    public void start (){
      System.out.println("Starting " + threadName);
      if(t==null){
          t= new Thread (this , threadName);
          t.start();
      }
    }
}
public class ThreadDemo {

    public static void main(String[] args) {
       ThreadTDemo T1 = new ThreadTDemo ("Thread-1");
       T1.start();
       ThreadTDemo T2 = new ThreadTDemo ("Thread - 2");
       T2.start();
    }
    
}
