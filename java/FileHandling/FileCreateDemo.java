import java.io.File;
import java.io.IOException;

public class FileCreation{
       
       public static void main(String[] args){
               File newFile = new File("myFile.txt");
            try {
               newFile.createNewFile();
            }catch(IOException e){
                 System.out.println(e);
            }

       }
}