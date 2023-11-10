import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
public class PalFile{


	public static void main(String[] args)throws IOException
	{
	BufferedReader br = new BufferedReader( new FileReader("f1.txt"));
	BufferedWriter bw = new BufferedWriter( new FileWriter("f2.txt"));
	String s;
	while ((s=br.readLine())!= null)
		{
	        int l = s.length();
            int flag = 0 ;

            for (int i = 0 ; i < l ; i++){
                String  s1 = Character.toString(s.charAt(i));
                String  s2 = Character.toString(s.charAt(l-1));
                if(s1.equals(s2)){
                     flag = 0 ;
                }else{
                    flag = 1;
                    break;
                }
                l--;
            }
         
          if(s.length() == 1){
                continue;
          }else if (flag == 0){
                 bw.write(s+"\n");
          }else if (flag == 1){
               continue;
          }
        
		}
        br.close();
        bw.close();
	}
}