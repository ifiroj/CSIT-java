import javax.swing.JFrame;
import java.awt.event.*;

public class MouseTest3 extends JFrame {
    public MouseTest3(){
        MouseEventHandler3 meh = new MouseEventHandler3();
        this.addMouseListener(meh);
        
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        MouseTest3 m = new MouseTest3();
    }
    
    class MouseEventHandler3 extends MouseAdapter{
        public void mouseClicked(MouseEvent m){
            System.out.println("Mouse clicked");
        }
    }
}

