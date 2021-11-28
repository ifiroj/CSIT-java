import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import java.net.*;
import java.io.*;

public class Server extends Thread{
    ServerSocket ss; // to open port
    Socket s;
    DataInputStream dis;//take input from network

    public void run(){
        System.out.println("Starting Server");
        while(true){
           try{
            s= ss.accept();
            dis= new DataInputStream(s.getInputStream());
            String a = dis.readUTF();
            System.out.println(a);
           }catch(Exception e){

           }
        }
    }
    public static void main(String[] args) {
        Server s = new Server();
        s.start();
    }

    public Server(){
        try {
            ss= new ServerSocket(7521);
        }catch (Exception e) {
            //TODO: handle exception
        }
}
}   