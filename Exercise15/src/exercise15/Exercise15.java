/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise15;

/**
 *
 * @author joy
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
public class Exercise15 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
       StringBuilder sb = new StringBuilder();
        String strLine = "";
        try
          {
             String filename= "/home/students/myfile.txt";
           //appends the string to the file
           try (FileWriter fw = new FileWriter(filename,false)) {
               //appends the string to the file
               fw.write("Python Exercises\n");
           }
           //read the file content
           try (BufferedReader br = new BufferedReader(new FileReader("/home/students/myfile.txt"))) {
               //read the file content
               while (strLine != null)
               {
                   sb.append(strLine);
                   sb.append(System.lineSeparator());
                   strLine = br.readLine();
                   System.out.println(strLine);
               }                          
           }
           }
           catch(IOException ioe)
           {
            System.err.println("IOException: " + ioe.getMessage());
           }
        }
    
}
