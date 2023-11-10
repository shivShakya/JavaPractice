import java.awt.*;
import javax.swing.*;

public class FlowDemo{

        JFrame f ;
        public FlowDemo(){
              f = new JFrame();

              JButton b1 = new JButton("b1");
              JButton b2 = new JButton("b2");
              JButton b3 = new JButton("b3");


              f.add(b1);
              f.add(b2);
              f.add(b3);

              f.setLayout(new FlowLayout(FlowLayout.LEFT));
              f.setSize(200,200);
              f.setVisible(true);


        }

        public static void main(String[] args){
                 new Flow();
        }
}