/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagere;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import static javax.imageio.ImageIO.write;
import sun.net.www.content.image.png;
 
public class ImageDownloader
{      
    public static void main(String[] args )
    {
        BufferedImage image =null;
        try{
 
            URL url =new URL("https://commons.wikimedia.org/wiki/Category:Architecture#/media/File:Ray_and_Maria_Stata_Center_(MIT).JPG");
            // read the url
           image = ImageIO.read(url);
 
            // for png 
            ImageIO.write(image, "png",new File("D:\\dectop.png"));
 
            // for jpg
            ImageIO.write(image, "jpg",new File("D:\\dectop.jpg"));
 
        }catch(IOException e){
            e.printStackTrace();
        }
    }}