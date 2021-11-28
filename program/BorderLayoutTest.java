import javax.swing.*;
import java.awt.*;

public class BorderLayoutTest extends JFrame
{

	JButton b1, b2, b3, b4, b5, b6;

	public BorderLayoutTest()
	{
		b1 = new JButton("B1");
		b2 = new JButton("B2");
		b3 = new JButton("B3");
		b4 = new JButton("B4");
		b5 = new JButton("B5");
		b6 = new JButton("B6");

		getContentPane().setLayout(new BorderLayout());	


		getContentPane().add(b1, BorderLayout.NORTH);
		getContentPane().add(b2, BorderLayout.EAST);
		getContentPane().add(b3, BorderLayout.WEST);
		getContentPane().add(b4, BorderLayout.SOUTH);
		getContentPane().add(b5, BorderLayout.CENTER);
		//getContentPane().add(b6);


		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 400);
		setVisible(true);
	}


	public static void main(String[] r)
	{
		BorderLayoutTest tf = new BorderLayoutTest();
	}

}