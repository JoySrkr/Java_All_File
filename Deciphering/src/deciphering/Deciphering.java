
package deciphering;
public class Deciphering {
    public static void main(String[] args) {
       char symbol ='A';
       symbol=(char)(128.0*Math.random());
       if(symbol>='A' && symbol<='Z')
       {
           System.out.println("You have the capital letter"+symbol);
           
       }
       else {
           if(symbol>='A' && symbol<='Z'){
               System.out.println("You have the small letter"+symbol);
               
           }
           else
           {
               System.out.println("The code is not a letter");
           }
       }
    }
    
}
