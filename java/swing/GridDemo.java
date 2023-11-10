import java.awt.*;
import javax.swing.*;

public class GridDemo{
      JFrame f;

      GridDemo(){
          f = new JFrame();
          
          for (int i = 0 ; i < 12 ; i++){
                JButton a = new JButton("a"+i);
                f.add(a);
          }

           f.setLayout(new GridLayout(3,4));
           f.setSize(400,400);
          f.setVisible(true);
      }

      public static void main(String[] args){
         new GridDemo();
      }
}