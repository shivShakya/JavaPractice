import java.util.ArrayList;
import java.util.Iterator;

public class ArrayGame{

      public static String [] ArrayListToArray(ArrayList<String> list){

              String [] strArray = new String[list.size()];

             Iterator<String> itr = list.iterator();
            
             for(int i = 0 ; i < strArray.length ; i++){
                   strArray[i] = itr.next();
             }
             return strArray;
      }

      public static ArrayList<String>ArrayToArrayList(String [] str){
            
             ArrayList<String> strList = new ArrayList<String>();

             for(String element : str){
                    strList.add(element);
             }
             return strList;
      }
      
       public static void main(String [] args){

             
              String str = "Hi I am Shivam Shakya";
              System.out.println(str);

              String [] strArray = str.split(" ");

              ArrayList<String> changeList = ArrayToArrayList(strArray);
              System.out.println("String Array to ArrayList :"+ changeList);

              
              System.out.print("String ArrayList to Array : ");
              String [] newString = ArrayListToArray(changeList);

              for(String element : newString){
                       System.out.print(element + " ");
              }
       }
}