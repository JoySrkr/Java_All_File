/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partofurl;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author joy
 */
public class PartOfUrl {

    public static void main(String[] args) throws Exception {
      URL u = new URL("https://www.thedailystar.net/coronavirus-deadly-new-threat/news/covid-19-current-positivity-rate-626-2059805");
      System.out.println("The URL is " + u);
      System.out.println("The file part is: " +u.getFile());
      System.out.println("Host is : "+ u.getHost());
      System.out.println("Path is " + u.getPath());
      System.out.println("Port is : "+u.getPort());
      
    }
    
}
