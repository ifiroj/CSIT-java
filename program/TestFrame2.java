import javax.swing.*;
import java.awt.*;//awt stands for abstract window toolkit

public class TestFrame2 extends JFrame{
	JButton b1 = new JButton("B1");
	JButton	b2 = new JButton("B2");
	JButton	b3 = new JButton("B3");
	JButton	b4 = new JButton("B4");
	JButton	b5 = new JButton("B5");
	JButton	b6 = new JButton("B6");
	public static void main(String[] args) {
		TestFrame2 t =new TestFrame2();
	}
	public TestFrame2(){
		System.out.println("Initialized");
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(b1,BorderLayout.NORTH);
		getContentPane().add(b2,BorderLayout.WEST);
		getContentPane().add(b3,BorderLayout.SOUTH);
		getContentPane().add(b4,BorderLayout.EAST);
		getContentPane().add(b5,BorderLayout.CENTER);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
