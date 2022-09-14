
package access;

import java.net.InetAddress;

public class Access {

    public static void main(String[] args) {
       try{
           InetAddress ip = InetAddress.getByName("www.google.com");
           InetAddress ip2 = InetAddress.getByName("www.youtube.com");
           
           System.out.println("Host Name: " + ip.getHostName());
           System.out.println("IP Address: "+ip.getHostAddress());
           
           
           System.out.println("Host Name: " + ip2.getHostName());
           System.out.println("IP Address: "+ ip2.getHostAddress());
       } catch(Exception e){
           System.out.println(e);
       }
    }
    
}
