import javax.swing.*;
import java.awt.*;

public class SidePanel extends JPanel{
	JButton b1 = new JButton("B1");
	JButton	b2 = new JButton("B2");
	JButton	b3 = new JButton("B3");
	JButton	b4 = new JButton("B4");
	JButton	b5 = new JButton("B5");
	JButton	b6 = new JButton("B6");

	public SidePanel(){
		setLayout(new GridLayout(3,2));
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
	}
}