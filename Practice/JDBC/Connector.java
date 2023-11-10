import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.*;
import java.awt.event.*;  

public class Connector
	{

        static int a = 0;

        public static void ButtonConnect(JLabel tf , int id){
                try{
                            Class.forName("com.mysql.cj.jdbc.Driver");
		                  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_work", "root", "doremon#22");
		                  String q = "select * from students where id = ?";
                          PreparedStatement pst = con.prepareStatement(q);
		        	      pst.setInt(1,id);
		        	      ResultSet rs = pst.executeQuery();
                          while(rs.next()){
                             tf.setText(rs.getString(2));	
                          }
                           con.close();
                           
                }catch(Exception ex){
                      ex.printStackTrace();
                }
                
        }
      

        public static void main(String[] args)
		{
     
		  try
			{
   
			   
               //frame
               JFrame f = new JFrame();
  
              //text Area
               JLabel tf = new JLabel();
               tf.setBounds(50,100,95,30);
               f.add(tf);

               //id buttons
                 JButton id1 = new JButton("1");
                 id1.setBounds(50,200,100,30);
                 f.add(id1);

                 JButton id2 = new JButton("2");
                 id2.setBounds(150,200,100,30);
                 f.add(id2);

                 JButton id3 = new JButton("3");
                 id3.setBounds(250,200,100,30);
                 f.add(id3);

                id1.addActionListener(new ActionListener() {
                     public void actionPerformed(ActionEvent e){
                           a = 1;
                            ButtonConnect(tf, a);
                     }
                 });

                 id2.addActionListener(new ActionListener() {
                     public void actionPerformed(ActionEvent e){
                           a = 2;
                            ButtonConnect(tf, a);
                     }
                 });

                  id3.addActionListener(new ActionListener() {
                     public void actionPerformed(ActionEvent e){
                           a = 3;
                           ButtonConnect(tf, a);
                     }
                 });

             

                f.setSize(400,400);
                f.setLayout(null);
                f.setVisible(true);
			}
			catch(Exception e) 
			{
                e.printStackTrace();
            }		
		}
}