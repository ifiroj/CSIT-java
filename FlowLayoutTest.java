import javax.swing.*;
import java.awt.*;

public class FlowLayoutTest extends JFrame
{

	JButton b1, b2, b3, b4, b5, b6;

	public FlowLayoutTest()
	{
		b1 = new JButton("B1");
		b2 = new JButton("B2");
		b3 = new JButton("B3");
		b4 = new JButton("B4");
		b5 = new JButton("B5");
		b6 = new JButton("B6");

		getContentPane().setLayout(new FlowLayout());		

		getContentPane().add(b1);
		getContentPane().add(b2);
		getContentPane().add(b3);
		getContentPane().add(b4);
		getContentPane().add(b5);
		getContentPane().add(b6);


		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 400);
		setVisible(true);
	}


	public static void main(String[] r)
	{
		FlowLayoutTest tf = new FlowLayoutTest();
	}

}