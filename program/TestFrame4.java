import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestFrame4 extends JFrame{

    JButton b1 = new JButton("b1");
    JButton b2 = new JButton("b2");
    JButton b3 = new JButton("b3");
    JButton b4 = new JButton("b4");
    JButton b5 = new JButton("b5");
    JButton b6 = new JButton("b6");
    
    public TestFrame4(){
        getContentPane().setLayout(new GridBagLayout());
        
        getContentPane().add(b1, new GridBagConstraints(0,0,1,1,0.33,0.33,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));
        getContentPane().add(b2, new GridBagConstraints(1,0,1,1,0.33,0.33,GridBagConstraints.EAST,GridBagConstraints.NONE,new Insets(0,0,0,0),0,0));
        getContentPane().add(b3, new GridBagConstraints(2,0,1,1,0.33,0.33,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));
        getContentPane().add(b4, new GridBagConstraints(0,1,2,2,0.66,0.66,GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL,new Insets(0,0,0,0),0,0));
        getContentPane().add(b5, new GridBagConstraints(2,1,1,1,0.33,0.33,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(0,0,0,0),0,0));
        getContentPane().add(b6, new GridBagConstraints(2,2,1,1,0.33,0.33,GridBagConstraints.CENTER,GridBagConstraints.VERTICAL,new Insets(0,0,0,0),0,0));
        
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ButtonEventHandler1 bh1 =  new ButtonEventHandler1();
        ButtonEventHandler2 bh2 =  new ButtonEventHandler2();
        b1.addActionListener(bh1);
        b1.addActionListener(bh2);
    }

    public static void main(String[] args) {
        TestFrame4 t = new TestFrame4();
    }
}

class ButtonEventHandler1 implements ActionListener  {
    
    public  void actionPerformed(ActionEvent a){
        System.out.println("You clicked me");
    }
}

class ButtonEventHandler2 implements ActionListener  {
    
    public  void actionPerformed(ActionEvent a){
        System.out.println("You clicked me twice.");
    }
}