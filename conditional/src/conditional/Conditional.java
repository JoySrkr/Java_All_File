/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditional;

/**
 *
 * @author joy
 */
public class Conditional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nHats=1;
        System.out.println("I have "+ nHats + "hat"+ (nHats==1?".":"s."));
        nHats++;
        System.out.println("I have "+ nHats + "hat"+ (nHats==1?".":"s."));
    }
    
}
