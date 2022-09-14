
package filesize;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class FileSize {

    public static void main(String[] args) throws Exception {
       URL url = new URL("http://www.tutorialspoint.com/javaexamples/net_multisoc.htm");
       URLConnection conn = url.openConnection();
       int size = conn.getContentLength();
       if(size<0) System.out.println("File size is empty");
       else System.out.println("File size is = " + size + "bytes");
       conn.getInputStream().close();
    }
    
}
