import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex{
        public static void main(String [] args){
                 
                 Pattern ptr = Pattern.compile("\\d{3,}");
                 Matcher mtc = ptr.matcher("000121412124");

                 boolean found = mtc.find();
                 System.out.println("Result " + found);
        }
}