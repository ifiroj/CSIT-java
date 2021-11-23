import javax.swing.JFrame;
import java.awt.event.*;

public class MouseTest2 extends JFrame {
    public MouseTest2(){
        MouseEventHandler2 meh = new MouseEventHandler2();
        this.addMouseListener(meh);
        
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        MouseTest2 m = new MouseTest2();
    }
}

class MouseEventHandler2 extends MouseAdapter{
    public void mouseClicked(MouseEvent m){
        System.out.println("Mouse clicked");
    }
}