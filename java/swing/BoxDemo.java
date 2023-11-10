import java.awt.*;
import javax.swing.*;

public class BoxDemo extends Frame{
     BoxDemo(){
         for(int i = 0 ; i < 3 ; i++){
              JButton b = new JButton("b"+i);
              add(b);
         }

         setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
         setSize(400,400);
         setVisible(true);
     }

     public static void main(String[] args){
     new BoxDemo(); 
}

}

