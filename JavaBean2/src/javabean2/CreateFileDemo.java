
package javabean2;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo{
    public static void main(String [] args){
      try{
          File file = new File("F:\\JavaApplication4\\Buffer.txt");
          boolean fvar = file.createNewFile();
          if(fvar){
              System.out.println("File has been created successfully ");
          } else{ System.out.println("File already Present ");
          
          }
      } catch(IOException o){
          System.out.println("Exception Occured: ");
          o.printStackTrace();
      }
             
    }
}