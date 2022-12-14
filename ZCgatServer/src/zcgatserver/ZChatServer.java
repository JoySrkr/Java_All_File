
package zcgatserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ZChatServer {
static int port;
static ServerSocket ss;
static Socket s;

    public static void main(String[] args) {
        
       Receivemsg receive =new Receivemsg();
       Sendmsg send = new Sendmsg ();
       Thread receiver =new Thread(receive);
       Thread sender = new Thread (send);
       try{
           port=Integer.parseInt(args[0]);
           ss=new ServerSocket(port);
           System.out.println("Server Started with port: "+ss.getLocalPort());
           s=ss.accept();
           System.out.println("Connection Established with client: "+
                   s.getRemoteSocketAddress());
           System.out.println
        ("**Note: Type 'bye'and press Enter to disconnect**");
           receiver.start();
           sender.start();
                   
       }catch(IOException e){
           e.printStackTrace();
       }
       
       
    }
    
}

class Sendmsg implements Runnable {

@Override
public void run(){
String input;
PrintWriter out =null;

try{
     out = new PrintWriter(ZChatServer.s.getOutputStream(),true);

} catch(IOException e){
    e.printStackTrace();
}
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
try{
    
    while(!(input=br.readLine()).equals("bye")){
      out.println(input);
}
out.println("Server disconnected");
ZChatServer.s.close();
} catch(IOException e){
    System.out.println("Disconnected");
}
}
}
class Receivemsg implements Runnable{
    @Override
    public void run(){
        String line;
        BufferedReader in=null;
        try{
            in=new BufferedReader(new InputStreamReader
        (ZChatServer.s.getInputStream()));
            
        } catch (IOException e){
        }
        try{
            while((line=in.readLine())!=null){
                if(line.equals("Client disconnected")){
                    System.out.println(">Client: bye");
                    System.out.println(line);
                    break;
                }
                System.out.println(">Server: "+line);
            }
        } catch(IOException e){
            System.out.println("Disconnected");
        }
    }
}