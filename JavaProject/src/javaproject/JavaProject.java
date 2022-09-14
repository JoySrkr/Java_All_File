
package javaproject;

public class JavaProject implements Generatior<Integer> {
private int count = 0;
public Integer next(){
    return fib(count++);
}
    

    private Integer fib(int n) {
       if(n<2) return 1;
       return fib(n-2)+fib(n-1);
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
      JavaProject gen = new JavaProject();
      for(int i = 0;i<18;i++)
          System.out.print(gen.next()+" ");
    }
    
}
