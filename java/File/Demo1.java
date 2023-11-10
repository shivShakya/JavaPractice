import java.io.*;

public class Demo1{
     
     public static void main(String[] args){
        try{
            FileInputStream  f1 = new FileInputStream("abc.txt");
            
            int i = 0 ;
            while( (i = f1.read()) != -1){
                  System.out.print((char)i);
            }
           f1.close();
        }catch(Exception e){
             e.printStackTrace();
        }
     }
}

/*
public class Demo1{


    public static void main(String[] args){
        try{
            FileOutputStream Fout = new FileOutputStream("abc.txt");

            String s = "Sourav is a good player";
            byte b[] = s.getBytes();

            Fout.write(b);
            Fout.close();
            System.out.println("Sucess...");
        }catch(Exception e){
             e.printStackTrace();
        }
    }
}
*/