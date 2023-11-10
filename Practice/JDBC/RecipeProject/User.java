import java.util.Properties;

import javax.swing.*;
import javax.swing.text.DateFormatter;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

class UserPage {
       
   public UserPage(){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Recipe App");
        frame.setSize(400, 400);
       
        JLabel l1 = new JLabel("Welcome");
        frame.add(l1);

        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateFormatter());

        frame.add(datePicker);
   }
}

public class User{
       public static void main(String[] args){
             new UserPage();
       }
}