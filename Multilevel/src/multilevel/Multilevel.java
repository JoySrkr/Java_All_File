/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multilevel;
interface one{
    public void print_geek();
}
interface two {
    public void print_for();
}
interface three extends one, two {
    @Override
    public void print_geek();
}
class child implements three{
    @Override
    public void print_geek()
    {
        System.out.println("Geeks");
    }
    
    @Override
    public void print_for(){
    System.out.println("for");
}
    
}

public class Multilevel {

    public static void main(String[] args) {
       child c;
        c = new child();
       c.print_geek();
       c.print_for();
       c.print_geek();
    }
    
}
