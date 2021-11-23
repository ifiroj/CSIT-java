import javax.swing.*;
import java.awt.*;


class Panel1 extends JPanel
{
	JLabel lName, lEmail, lPhone;
	JTextField tName, tEmail, tPhone;

	public Panel1()
	{

		lName = new JLabel("Name");
		lEmail = new JLabel("Email");
		lPhone = new JLabel("Phone");

		tName = new JTextField();
		tEmail = new JTextField();
		tPhone = new JTextField();

		setLayout(new GridBagLayout());	

		add(lName,  
new GridBagConstraints(0, 0, 1, 1, 0.3, 0.33, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0,0,0,0), 0, 0));
		add(tName,  
new GridBagConstraints(1, 0, 1, 1, 0.7, 0.33, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0,0,0,0), 0, 0));

		add(lEmail,  
new GridBagConstraints(0, 1, 1, 1, 0.3, 0.33, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0,0,0,0), 0, 0));
		add(tEmail,  
new GridBagConstraints(1, 1, 1, 1, 0.7, 0.33, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0,0,0,0), 0, 0));

		add(lPhone,  
new GridBagConstraints(0, 2, 1, 1, 0.3, 0.33, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0,0,0,0), 0, 0));
		add(tPhone,  
new GridBagConstraints(1, 2, 1, 1, 0.7, 0.33, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL, new Insets(0,0,0,0), 0, 0));
	}
}



class Panel2 extends JPanel
{
	JButton b1, b2, b3, b4;

	public Panel2()
	{
		b1 = new JButton("B1");
		b2 = new JButton("B2");
		b3 = new JButton("B3");
		b4 = new JButton("B4");

		setLayout(new GridBagLayout());	

		add(b1,  
new GridBagConstraints(0, 0, 1, 1, 0.25, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,0,0), 0, 0));
		add(b2,  
new GridBagConstraints(1, 0, 1, 1, 0.25, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,0,0), 0, 0));

		add(b3,  
new GridBagConstraints(2, 0, 1, 1, 0.25, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,0,0), 0, 0));
		add(b4,  
new GridBagConstraints(3, 0, 1, 1, 0.25, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,0,0), 0, 0));

	}
}



class Panel3 extends JPanel
{
	JButton b5, b6;
	JTextArea ta;

	public Panel3()
	{
		b5 = new JButton("B5");
		b6 = new JButton("B6");

		ta = new JTextArea();

		setLayout(new GridBagLayout());	

		add(b5,  
new GridBagConstraints(1, 0, 1, 1, 0.3, 0.7, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,0,0), 0, 0));
		add(b6,  
new GridBagConstraints(1, 1, 1, 1, 0.3, 0.3, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,0,0), 0, 0));

		add(ta,  
new GridBagConstraints(0, 0, 1, 2, 0.7, 1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,0,0), 0, 0));
		

	}
}


public class GridBagLayoutTest3 extends JFrame
{

	Panel1 p1;
	Panel2 p2;
	Panel3 p3;

	public GridBagLayoutTest3()
	{
		p1 = new Panel1();
		p2 = new Panel2();
		p3 = new Panel3();

		getContentPane().setLayout(new GridBagLayout());	

		getContentPane().add(p1,  
new GridBagConstraints(0, 0, 1, 1, 1.0, 0.3, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,0,0), 0, 0));

		getContentPane().add(p2,  
new GridBagConstraints(0, 1, 1, 1, 1.0, 0.2, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,0,0), 0, 0));

		getContentPane().add(p3,  
new GridBagConstraints(0, 2, 1, 1, 1.0, 0.5, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,0,0), 0, 0));

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 400);
		setVisible(true);
	}


	public static void main(String[] r)
	{
		GridBagLayoutTest3 tf = new GridBagLayoutTest3();
	}

}
