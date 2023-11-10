import javax.swing.*;


public class ButtonDemo1{
    ButtonDemo1(){
          JFrame f=new JFrame("Button Example");
          String img = "aamchi_mess.png";
          ImageIcon icon= new ImageIcon(img);
          JButton b=new JButton(icon); 
          b.setBounds(0,0,icon.getIconWidth(), icon.getIconHeight());
          
          f.add(b);
          f.setSize(700,700);
          f.setLayout(null);
          f.setVisible(true); 
          f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public static void main(String[] args) {

       new ButtonDemo1(); 
}
}