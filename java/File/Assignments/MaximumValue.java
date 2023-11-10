import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class MaximumValue{

      public static void main(String[] args){

       try{ 

          BufferedReader r = new BufferedReader(new FileReader("numbers.txt"));

          String s; 
          int max = 0;
          
          while( (s = r.readLine()) != null){  
                 int number =  Integer.parseInt(s);
                 
                 if(number > max){
                      max = number;
                 }       
          }
           System.out.println(max);

           }
       catch(FileNotFoundException e){
            e.printStackTrace();
       }catch(IOException e){
            e.printStackTrace();
       }
         
      }
}