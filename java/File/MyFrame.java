/*import javax.swing.*;
class MyFrame
{
 	JFrame f;
	MyFrame()
	{
		f = new JFrame("Frame");
		f.setTitle("My First Window");
		f.setSize(500,300);
		f.setLocation(200,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new MyFrame();
	}
}

*/
/*
import javax.swing.*;
class MyFrame extends JFrame
{
// 	JFrame f;
	MyFrame()
	{
		//f = new JFrame("Welcome Frame");
		//super("Welcome Frame");
		setTitle("Welcome Frame");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new MyFrame();
	}
}

*/


/*
import javax.swing.*;
class MyFrame extends JFrame
{
	JLabel l1,l2;
	JButton b1,b2;
	JTextField t1,t2;
	
	MyFrame()
	{
		l1 = new JLabel("Label-1");
		l2 = new JLabel("Label-2");
		b1 = new JButton("Ok");
		b2 = new JButton("Cancel");
		t1 = new JTextField("Math");
		t2 = new JTextField("Computer");
		
		setLayout(null);

		l1.setBounds(100,100,80,20);
		l2.setBounds(100,200,80,20);
		t1.setBounds(300,100,80,20);
		t2.setBounds(300,200,80,20);
		b1.setBounds(100,300,80,20);
		b2.setBounds(300,300,80,20);

		//add component
		add(l1);
		add(t1);
		add(l2);
		
		add(b1);
		add(b2);
		add(t2);

		setTitle("Welcome Frame");
		setSize(300,300);
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new MyFrame();
	}
}
*/
/*
import javax.swing.*;
import java.awt.*;

class MyFrame extends Frame
{
	Label l1,l2;
	Button b1,b2;
	TextField t1,t2;
	
	MyFrame()
	{
		l1 = new Label("Label-1");
		l2 = new Label("Label-2");
		b1 = new Button("Ok");
		b2 = new Button("Cancel");
		t1 = new TextField("Math");
		t2 = new TextField("Computer");
		
		setLayout(null);

		l1.setBounds(100,100,80,20);
		l2.setBounds(100,200,80,20);
		t1.setBounds(300,100,80,20);
		t2.setBounds(300,200,80,20);
		b1.setBounds(100,300,80,20);
		b2.setBounds(300,300,80,20);

		//add component
		add(l1);
		add(t1);
		add(l2);
		
		add(b1);
		add(b2);
		add(t2);

		setTitle("Welcome Frame");
		setSize(300,300);
		setLocation(200,200);
		//setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new MyFrame();
	}
}
*/

import java.awt.*;
import javax.swing.*;
class MyFrame extends JFrame
{
	JLabel l1,l2;
	JButton b1,b2;
	JTextField t1,t2;
	
	MyFrame()
	{
		l1 = new JLabel("Label-1");
		l2 = new JLabel("Label-2");
		b1 = new JButton("Ok");
		b2 = new JButton("Cancel");
		t1 = new JTextField("Math");
		t2 = new JTextField("Computer");
		
		setLayout(new GridLayout(4,2));

		//l1.setBounds(100,100,80,20);
		//l2.setBounds(100,200,80,20);
		//t1.setBounds(300,100,80,20);
		//t2.setBounds(300,200,80,20);
		//b1.setBounds(100,300,80,20);
		//b2.setBounds(300,300,80,20);

		//add component
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
		

		setTitle("Welcome Frame");
		setSize(300,300);
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new MyFrame();
	}
}
