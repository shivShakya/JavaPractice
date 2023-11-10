import javax.swing.*;
import java.awt.event.*;
import java.lang.IllegalArgumentException;

public class CheckBoxDemo{
    CheckBoxDemo(){       
        try{
            JFrame f = new JFrame("Check Box Example");
            //deifining labels
            final JLabel label1 = new JLabel();
            label1.setHorizontalAlignment(JLabel.CENTER);
            label1.setVerticalAlignment(50);
            label1.setSize(400,100);
            final JLabel label2 = new JLabel();
            label2.setHorizontalAlignment(JLabel.CENTER);
            label2.setVerticalAlignment(100);
            label2.setSize(400,100);
            JCheckBox checkbox1 = new JCheckBox("C++");
            checkbox1.setSize(400,100);
            JCheckBox checkbox2 = new JCheckBox("Java");
            checkbox2.setBounds(100,150,100,50);
            f.add(checkbox1);
            f.add(checkbox2);
            f.add(label1);
            f.add(label2);
            checkbox1.addItemListener(new ItemListener(){
                      public void itemStateChanged(ItemEvent e ){
                                label1.setText("C++ Checkbox : " + (e.getStateChange() == 1? "checked": "unchecked"));
                      }
            });
            checkbox2.addItemListener(new ItemListener(){
                      public void itemStateChanged(ItemEvent e){
                                label2.setText("Java Checkbox : "+ (e.getStateChange() == 1? "checked": "unchecked"));
                      }
            });
            f.setSize(400,400);
            f.setLayout(null);
            f.setVisible(true);  
       }   
    catch(IllegalArgumentException e){
          System.out.println("Problem");
    }     
    }

    public static void main(String[] args){
           new  CheckBoxDemo() ; 
    }
}