
package soketatspecificport;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author HP
 */

public class SplitHostIP {
   public static void main(String[] args) {
     InetAddress ipadd;
     String hostname;
     try{
         ipadd = InetAddress.getLocalHost();
         hostname = ipadd.getHostName();
         System.out.println("Your IP Address : " + ipadd);
         System.out.println("Your HostName: " + hostname);
     } catch (UnknownHostException e){
         
     }
   }
}