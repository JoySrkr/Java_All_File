
package image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;

public class ImageDo{
    public  static void main(String[] args) {
        BufferedImage image = null;
        try{
            URL url = new URL("https://commons.wikimedia.org/wiki/Category:Landscapes#/media/File:%22vista_desde_el_Xitle.jpg%22.jpg");
          image = ImageIO.read(url);  
          
          ImageIO.write(image,"png",new File("D:\\Landscape.png"));
          
          ImageIO.write(image,"jpg",new File("D:\\Landscape2.jpg"));
          
        }catch(IOException e){
            e.printStackTrace();
        }
            
    }
}