import javax.swing.*;

public class MyFrame extends JFrame {

        JLabel j1, j2 ;
        JButton b1 , b2 ;
        JTextField t1, t2;
        public MyFrame(){

                j1 = new JLabel("Label 1");
                j1.setBounds(100,50,100,100);
                j2 = new JLabel("Label 2");
                j2.setBounds(100,100,100,100);


                b1 = new JButton("one");
                b1.setBounds(200,50,100,50);
                b2 = new JButton("two");
                b2.setBounds(200,100,100,50);

                t1 = new JTextField("My text -1");
                t1.setBounds(50,200,100,50);
                t2 = new JTextField("My text -2");
                t1.setBounds(100,200,100,50);

                add(j1);
                add(j2);
                add(b1);
                add(b2);
                add(t1);
                add(t2);
                setLayout(null);
                setTitle("Welcom to frame");
                setSize(400,400);
                setLocation(200,200);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(true); 
        }

        public static void main(String[] args){
               new MyFrame();
        }
}