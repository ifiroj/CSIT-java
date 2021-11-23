import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import java.net.*;
import java.io.*;

public class Server2 extends Thread{
    ServerSocket ss; // to open port
    Socket s;
    ObjectInputStream ois;//take input from network

    public void run(){
        System.out.println("Starting Server");
        while(true){
           try{
            s= ss.accept();
            ois= new ObjectInputStream(s.getInputStream());
            Book a =(Book)ois.readObject();
            a.printDetail();
           }catch(Exception e){

           }
        }
    }
    public static void main(String[] args) {
        Server2 s = new Server2();
        s.start();
    }

    public Server2(){
        try {
            ss= new ServerSocket(7521);
        }catch (Exception e) {
            //TODO: handle exception
        }
}
}   