import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class DrawTest extends JFrame implements ActionListener{
    JButton b1 = new JButton("B1");
    DrawingArea da = new DrawingArea();

    public void actionPerformed(ActionEvent a){
        System.out.println("Clicked");
        Thread t = new Thread(da);
        t.start();
    }

    public DrawTest(){
       b1.addActionListener(this);
        this.getContentPane().setLayout(new GridBagLayout());

        this.getContentPane().add(b1,new GridBagConstraints(0,0,1,1,1.0,0.1,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(0,0,0,0),0,0));
        
        this.getContentPane().add(da,new GridBagConstraints(0,1,1,1,1.0,0.9,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));

        da.repaint();

        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
            DrawTest d = new DrawTest();       
    } 
}

class DrawingArea extends Canvas implements Runnable{

    int x,y;
    public DrawingArea(){
        x=50;
        y=50;
    }

    public void run(){
        Random r = new Random();
        while(true){
            x=r.nextInt(400);
            y=r.nextInt(400);
            repaint();
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException i){
                
            }
        }
    }

    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(x,y,100,100);
    }
}
