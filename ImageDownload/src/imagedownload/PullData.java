/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagedownload;

import java.io.*;
import java.net.URL;

public class PullData {

    public static void main(String[] args) throws Exception {
        URL url = new URL("https://en.wikipedia.org/wiki/Bangladesh_Open_University");
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        BufferedWriter writer = new BufferedWriter(new FileWriter("F:\\JavaApplication4.html"));
        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            writer.write(line);
            writer.newLine();
        }
        reader.close();
        writer.close();
    }
}