/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package network;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;



public class Network {

    public static void main(String[] args) throws Exception  {
        URL url = new URL("http://wwww.google.com");
        HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
      long date = httpCon.getDate();
      if(date==0){
          System.out.println("No Date Information");
          
      }else{
          System.out.println("Date: "+new Date(date));
      }
}
}
