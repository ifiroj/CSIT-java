import javax.swing.JFrame;
import java.awt.event.*;

public class MouseTest extends JFrame {
    public MouseTest(){
        MouseEventHandler meh = new MouseEventHandler();
        this.addMouseListener(meh);
        
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        MouseTest m = new MouseTest();
    }
}

class MouseEventHandler implements MouseListener{
    public void mouseExited(MouseEvent m){
        System.out.println("Mouse exited");
    }
    
    public void mouseEntered(MouseEvent m){
        System.out.println("Mouse entered");
    }
    
    public void mouseReleased(MouseEvent m){
        System.out.println("Mouse released");
    }
    
    public void mousePressed(MouseEvent m){
        System.out.println("Mouse pressed");
    }
    
    public void mouseClicked(MouseEvent m){
        System.out.println("Mouse clicked");
    }
}