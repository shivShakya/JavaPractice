import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    JTextField t1, t2, t3;
    JButton plus, sub, mul, div;

    public Calculator() {
        t1 = new JTextField();
        t1.setBounds(100, 40, 100, 20);

        t2 = new JTextField();
        t2.setBounds(100, 70, 100, 20);

        t3 = new JTextField();
        t3.setBounds(100, 100, 100, 20);

        plus = new JButton("+");
        plus.setBounds(100, 130, 50, 20);
        plus.addActionListener(this);

        sub = new JButton("-");
        sub.setBounds(160, 130, 50, 20);
        sub.addActionListener(this);

        mul = new JButton("*");
        mul.setBounds(100, 160, 50, 20);
        mul.addActionListener(this);

        div = new JButton("/");
        div.setBounds(160, 160, 50, 20);
        div.addActionListener(this);

        add(t1);
        add(t2);
        add(t3);
        add(plus);
        add(sub);
        add(mul);
        add(div);


        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(t1.getText());
        double num2 = Double.parseDouble(t2.getText());
        double result = 0;

        if (e.getSource() == plus) {
            result = num1 + num2;
        } else if (e.getSource() == sub) {
            result = num1 - num2;
        } else if (e.getSource() == mul) {
            result = num1 * num2;
        } else if (e.getSource() == div) {
            result = num1 / num2;
        }

        t3.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        new Calculator();
    }
}