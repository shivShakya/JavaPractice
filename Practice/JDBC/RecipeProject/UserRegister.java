import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.DateFormatter;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import java.net.URI;
import java.net.URL;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class UserRegister {

    private JFrame frame;
    private CardLayout cardLayout;
    
    //panels
    private JPanel mainPanel;
    private JPanel pR;
    private JPanel pL;
    private JPanel pM;
   
     

    //register
    private JTextField firstName;
    private JTextField lastName;
    private JTextField email;
    private JPasswordField password;
    private JFormattedTextField dateField;
   
    //login
    private JTextField email_log;
    private JPasswordField password_log;
     
    //Connection
    private Connection con;

    



    //constructor
    public UserRegister() throws SQLException,ClassNotFoundException {
        createFrame();

        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/recipeapp", "root", "doremon#22");

        mainPanel = new JPanel();
        cardLayout = new CardLayout();
        mainPanel.setLayout(cardLayout);
         
        createRegForm();
        createLoginForm();
        createRecipePage();

        JButton switchButton = new JButton("Switch Panels");
        switchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(mainPanel);
            }
        });
        frame.add(switchButton, BorderLayout.SOUTH);
        frame.add(mainPanel, BorderLayout.CENTER);
    }
   
    //Frame

    private void createFrame() {
        frame = new JFrame("Welcome to Recipe App");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
   
    //Registration

    private void createRegForm() {
        pR = new JPanel();
        pR.setLayout(new GridLayout(6, 2));

        JLabel l1 = new JLabel("First Name");
        firstName = new JTextField();

        JLabel l2 = new JLabel("Last Name");
        lastName = new JTextField();

        JLabel l3 = new JLabel("Email");
        email = new JTextField();

        JLabel l4 = new JLabel("Password");
        password = new JPasswordField();

        JLabel l5 = new JLabel("Date");
         
        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateFormatter());

     

        JButton registerButton = new JButton("Register");
        registerButton.addActionListener(e -> registerUser());

        pR.add(l1);
        pR.add(firstName);
        pR.add(l2);
        pR.add(lastName);
        pR.add(l3);
        pR.add(email);
        pR.add(l4);
        pR.add(password);
        pR.add(l5);
        pR.add(datePicker);
        pR.add(registerButton);
        mainPanel.add(pR);
    }

    private void registerUser() {
        try {

            String q = "INSERT INTO user (first_name, last_name, email, password, reg_date) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(q);
            pst.setString(1, firstName.getText());
            pst.setString(2, lastName.getText());
            pst.setString(3, email.getText());
            System.out.println(password.getPassword());
            pst.setString(4, new String(password.getPassword()));
            pst.setString(5, dateField.getText());
    
            int rs = pst.executeUpdate();

            if (rs == 1) {
                JOptionPane.showMessageDialog(frame, "User registration successful!", "Success",JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(frame, "User registration Failed!", "Success",JOptionPane.INFORMATION_MESSAGE);
            }

            firstName.setText("");
            lastName.setText("");
            email.setText("");
            password.setText("");
            dateField.setText("");
            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, ex.getMessage(), "Exception", JOptionPane.INFORMATION_MESSAGE);  
        }
    }
   
    //Login form

    private void createLoginForm(){
            pL = new JPanel();
            pL.setLayout(new GridLayout(3, 2));

            JLabel l3 = new JLabel("Email");
            email_log = new JTextField();

            JLabel l4 = new JLabel("Password");
            password_log = new JPasswordField();

            JButton loginButton = new JButton("Login");
            loginButton.addActionListener(e -> loginUser());

            pL.add(l3);
            pL.add(email_log);
            pL.add(l4);
            pL.add(password_log);
            pL.add(loginButton);
            mainPanel.add(pL);
    } 

    public void loginUser(){
       try{ 
            String q = "select * from user where email= ? and password = ?";
            PreparedStatement pst = con.prepareStatement(q);
            pst.setString(1, email_log.getText());
            pst.setString(2, new String(password_log.getPassword()));
    
            ResultSet rs = pst.executeQuery();

             if (!rs.next()){
                       JOptionPane.showMessageDialog(frame, "Wrong credentials", "Error", JOptionPane.INFORMATION_MESSAGE);
            }

            while(rs.next()){
                  JOptionPane.showMessageDialog(frame,"Hello "+ rs.getString(2), "Success", JOptionPane.INFORMATION_MESSAGE);
            }
  
           email_log.setText("");
           password_log.setText("");

           con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, ex.getMessage(), "Exception", JOptionPane.INFORMATION_MESSAGE);  
        }
    }


    //Recipe

    private ArrayList<String> getList(){
           
           ArrayList<String> recipyList = new ArrayList<>();
    
           try{ 
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select rec_name from recipe");

            while(rs.next()){
                 recipyList.add(rs.getString(1));
            }
  
           email_log.setText("");
           password_log.setText("");

           con.close();
          } catch (Exception ex) {
                 JOptionPane.showMessageDialog(frame, ex.getMessage(), "Exception", JOptionPane.INFORMATION_MESSAGE);  
          }

        return recipyList;
     }

    public void createRecipePage(){
             pM = new JPanel(new BorderLayout());
             ArrayList<String> data = getList();
             String[] dataArray = data.toArray(new String[0]);

             JList<String> recipeList = new JList<String>(dataArray);
             JScrollPane recipeList1 = new JScrollPane(recipeList);

             JTextArea recipeMain = new JTextArea();
             JScrollPane recipeMain1 = new JScrollPane(recipeMain);
             JLabel label = new JLabel();


            recipeList.addListSelectionListener(new ListSelectionListener() {
               @Override
                 public void valueChanged(ListSelectionEvent e) {
                           try{

                               if (!e.getValueIsAdjusting()) {
                                     int selectedIndex = recipeList.getSelectedIndex();
                                     if (selectedIndex >= 0) {
                                            String selectedRecipe = data.get(selectedIndex);
                                            PreparedStatement pst = con.prepareStatement("select * from recipe where rec_name = ?");
                                            pst.setString(1,selectedRecipe);
                                             
                                            ResultSet rs = pst.executeQuery();

                                            while (rs.next()) {
                                                recipeMain.setText(rs.getString(2) + "\n" + rs.getString(3) + "\n" + "\n" + rs.getString(5));
                                                URL url = new URI(rs.getString(4)).toURL();
                                                BufferedImage originalImage = ImageIO.read(url);                   
                                                Image resizedImage = originalImage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);             
                                                ImageIcon icon = new ImageIcon(resizedImage);
                                               
                                                label.setIcon(icon);
                                                pM.add(label, BorderLayout.EAST);

                                            }
                                    }
                                 }

                        } catch (Exception ex) {
                                 JOptionPane.showMessageDialog(frame, ex.getMessage(), "Exception", JOptionPane.INFORMATION_MESSAGE);  
                         }
                     }
               });

             pM.add(recipeList1,BorderLayout.WEST);
             pM.add(recipeMain1,BorderLayout.CENTER);
             mainPanel.add(pM);
    }



    public static void main(String[] args) throws ClassNotFoundException, SQLException {
            new UserRegister();
    }
}
