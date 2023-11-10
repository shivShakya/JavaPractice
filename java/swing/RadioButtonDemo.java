import javax.swing.*;
import java.awt.event.*;


class RadioButtonDemo extends JFrame implements ActionListener{

     JRadioButton rb1 , rb2;
     JButton b ;

     RadioButtonDemo(){
         rb1 = new JRadioButton("Java");
         rb1.setBounds(100,50,100,30);

         rb2 = new JRadioButton("C++");
         rb2.setBounds(100,100,100,30);

         ButtonGroup bg = new ButtonGroup();
         bg.add(rb1);
         bg.add(rb2);

         b = new JButton("click");
         b.setBounds(100,150,100,30);
         b.addActionListener(this);

         add(rb1);
         add(rb2);
         add(b);

         setSize(400,400);
         setLayout(null);
         setVisible(true);    
     }

     public void actionPerformed(ActionEvent e){
        if(rb1.isSelected()){
              JOptionPane.showMessageDialog(this,"You selected Java");
        }
         if(rb2.isSelected()){
              JOptionPane.showMessageDialog(this,"You selected c++");
        }
     }

     public static void main(String[] args){
               new RadioButtonDemo();
     }
}