import javax.swing.*;
import java.awt.*;

public class Combo extends JFrame implements ActionListener{
       
       JButton b;
       JComboBox c;
       JTextField t;
       JPanel p;

       public Combo(){
           p = new JPanel();
           b = new JButton("Choose");
           t = new JTextField("");
           t.setBounds(100,100,100,50);



           String sub[] = {"java", "c++", "c", "python", "javascript"};
           c = new JComboBox(sub);
           b.addActionListener(new ActionListener( ){
                public void actionPerformed(ActionEvent e){
                    String text = t.getText().toString();

                    if(!text.isEmpty()){
                        c.addItem(text);
                        t.setText("");
                    }

                }
       });

           p.add(b);
           p.add(t);
           p.add(c);

           add(p);
           
           setSize(400,400);
           setLocation(200,200);
           setVisible(true);
       }

     
      
      
       
       public static void main(String[] args){
                new Combo();
       }
}