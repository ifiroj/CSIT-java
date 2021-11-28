import javax.swing.*;
import java.awt.*;//awt stands for abstract window toolkit

public class TestFrame3 extends JFrame{
	TopPanel t = new TopPanel();
	SidePanel s = new SidePanel();

	JButton	b3 = new JButton("B3");
	JButton	b2 = new JButton("B2");
	JButton	b5 = new JButton("B5");
	
	public static void main(String[] args) {
		TestFrame3 t =new TestFrame3();
	}
	public TestFrame3(){
		System.out.println("Initialized");
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(t,BorderLayout.NORTH);
		getContentPane().add(b2,BorderLayout.WEST);
		getContentPane().add(b3,BorderLayout.SOUTH);
		getContentPane().add(s,BorderLayout.EAST);
		getContentPane().add(b5,BorderLayout.CENTER);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
