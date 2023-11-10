import java.util.Properties;

import javax.swing.*;
import javax.swing.text.DateFormatter;

class LabelDemo {
    public static void main(String[] args){
        JFrame f = new JFrame("Label Example");
        JLabel l1, l2;
        l1 = new JLabel("Enter Your Username");
        l1.setBounds(100,100,250,60);
        l2 = new JLabel("Enter Your Password");
        l2.setBounds(100,200,250,60);

        
        UtilDateModel model = new UtilDateModel();

        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(model,p);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateFormatter());
 
        
        
        f.add(datePicker);


        f.add(l1);
        f.add(l2);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
}