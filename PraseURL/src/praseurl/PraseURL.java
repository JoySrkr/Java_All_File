/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praseurl;

/**
 *
 * @author joy
 */
import java.net.*;
import java.io.*;
public class PraseURL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        URL aURL=new URL("http://java.sun.com:80/docs/books/"+"tutorial/index.html#DOWNLOADING");
        System.out.println("protocol="+
                aURL.getProtocol());System.out.println("host="+
                        aURL.getHost());System.out.println("filename="+
                                aURL.getFile());System.out.println("port="+
                                        aURL.getPort());System.out.println("ref= "+
                                                aURL.getRef());
        
    }
    
}
