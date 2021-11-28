import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client2 {
    ObjectOutputStream oos;
    Socket s;

    public void sendData(Book a){
      try{
        s= new Socket("192.168.254.8",7521);
        oos = new ObjectOutputStream(s.getOutputStream());
        oos.writeObject(a);
        oos.close();
        s.close();
      }catch(Exception e){

      }
    }
    public static void main(String[] args) {
        Client2 c = new Client2();
        Book b = new Book("Harry porter", "323243", 1000.34f);
        c.sendData(b);
    }    
}
