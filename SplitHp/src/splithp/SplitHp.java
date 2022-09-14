
package splithp;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class SplitHp {

    public static void main(String[] args) {
      InetAddress ipadd;
      String hostname;
      try{
          ipadd = InetAddress.getLocalHost();
          hostname = ipadd.getHostName();
          System.out.println("Your IP Address: " + ipadd);
          System.out.println("Your Host Name: " + hostname);
          
      }catch(UnknownHostException e){
          
      }
    }
    
}
