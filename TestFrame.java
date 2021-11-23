import javax.swing.*;
import java.awt.*;//awt stands for abstract window toolkit

public class TestFrame extends JFrame{
	JButton b1 = new JButton("B1");
	JButton	b2 = new JButton("B2");
	JButton	b3 = new JButton("B3");
	JButton	b4 = new JButton("B4");
	JButton	b5 = new JButton("B5");
	JButton	b6 = new JButton("B6");
	public static void main(String[] args) {
		TestFrame t =new TestFrame();
	}
	public TestFrame(){
		System.out.println("Initialized");
		//getContentPane().setLayout(new FlowLayout());
		getContentPane().setLayout(new GridLayout(2,3));
		getContentPane().add(b1);
		getContentPane().add(b2);
		getContentPane().add(b3);
		getContentPane().add(b4);
		getContentPane().add(b5);
		getContentPane().add(b6);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
