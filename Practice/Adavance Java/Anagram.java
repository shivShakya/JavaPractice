import java.util.Scanner;
import java.util.HashMap;
public class Anagram{


    public static boolean isAnagram(String str1 , String str2){
            
            HashMap<Character,Integer>map1 = new HashMap<Character,Integer>();
            HashMap<Character,Integer>map2 = new HashMap<Character,Integer>();

            char [] strArray1 = str1.toCharArray();
            char [] strArray2 = str2.toCharArray();

            for( char a : strArray1){
                   int j = map1.getOrDefault(a, 0);
                   map1.put(a,j+1);
            }

            for( char a : strArray2){
                   int j = map2.getOrDefault(a, 0);
                   map2.put(a,j+1);
            }

            if(map1.equals(map2)){
                  return true;
            }
         return false;
      }
        
      public static void main(String [] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter first string : ");
         String str = sc.next();
         String string1 = str.toLowerCase();

         System.out.print("Enter second string : ");
         String string2 = sc.next();

        System.out.println("Is Anagram ? : " + isAnagram(string1, string2));
        sc.close();
      }   
}