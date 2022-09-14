
package copyfile;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo {

    public static void main(String[] args) {
        try{
            File file = new File("F:\\JavaAppl.txt");
            
            boolean fvar = file.createNewFile();
            
            if(fvar)
            {
                System.out.println("File Create Sucessfully");
                
            }else{
                System.out.println("There is a File with same name");
                
            }
        }catch(IOException e){
            System.out.println("Exception Occured: ");
            e.printStackTrace();
        }
    }
}