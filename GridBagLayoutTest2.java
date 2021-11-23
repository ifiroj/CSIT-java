import javax.swing.*;
import java.awt.*;

public class GridBagLayoutTest2 extends JFrame
{

	JButton b1, b2, b3, b4, b5, b6, b7, b8;

	public GridBagLayoutTest2()
	{
		b1 = new JButton("B1");
		b2 = new JButton("B2");
		b3 = new JButton("B3");
		b4 = new JButton("B4");
		b5 = new JButton("B5");
		b6 = new JButton("B6");
		b7 = new JButton("B7");
		b8 = new JButton("B8");

		getContentPane().setLayout(new GridBagLayout());	


		//Gx, Gy, Gw, Gh, Wx, Wy, Anc, Fill, Insets - t,r,b,l, Px, Py

getContentPane().add(b1, 
new GridBagConstraints(0, 0, 1, 3, 0.33, 0.75, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,0,0), 0, 0));

getContentPane().add(b2, 
new GridBagConstraints(1, 0, 2, 1, 0.66, 0.25, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,0,0), 0, 0));

getContentPane().add(b3, 
new GridBagConstraints(1, 1, 1, 1, 0.33, 0.25, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,0,0), 0, 0));

getContentPane().add(b4, 
new GridBagConstraints(2, 1, 1, 1, 0.33, 0.25, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,0,0), 0, 0));

getContentPane().add(b5, 
new GridBagConstraints(1, 2, 2, 1, 0.66, 0.25, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,0,0), 0, 0));

getContentPane().add(b6, 
new GridBagConstraints(0, 3, 1, 1, 0.33, 0.25, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,0,0), 0, 0));

getContentPane().add(b7, 
new GridBagConstraints(1, 3, 1, 1, 0.33, 0.25, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,0,0), 0, 0));

getContentPane().add(b8, 
new GridBagConstraints(2, 3, 1, 1, 0.33, 0.25, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,0,0), 0, 0));


		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 400);
		setVisible(true);
	}


	public static void main(String[] r)
	{
		GridBagLayoutTest2 tf = new GridBagLayoutTest2();
	}

}
