import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CardDemo extends JFrame implements ActionListener {
    CardLayout c_card;
    JButton box1, box2, box3;
    Container d;

    CardDemo() {
        d = getContentPane();
        c_card = new CardLayout(200, 200);
        d.setLayout(c_card);

        box1 = new JButton("1");
        box2 = new JButton("2");
        box3 = new JButton("3");

        box1.addActionListener(this);
        box2.addActionListener(this);
        box3.addActionListener(this);

        d.add("P", box1);
        d.add("Q", box2);
        d.add("R", box3);
    }

    public void actionPerformed(ActionEvent e) {
        c_card.next(d);
    }

    public static void main(String[] args) {
        CardDemo obj = new CardDemo();
        obj.setSize(500, 500);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}