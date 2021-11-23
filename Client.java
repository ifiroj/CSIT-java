import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
    DataOutputStream dos;
    Socket s;

    public void sendData(String a){
      try{
        s= new Socket("192.168.254.8",7521);
        dos = new DataOutputStream(s.getOutputStream());
        dos.writeUTF(a);
        dos.close();
        s.close();
      }catch(Exception e){

      }
    }
    public static void main(String[] args) {
        Client c = new Client();
        c.sendData("Hello from kiran");
    }    
}
