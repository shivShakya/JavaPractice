public class stringNew{
     
      public static void main(String[] args){
            
              String s = "shivam shakya joshi";
              String[] splitArray = s.split(" ");
              String sb = "";
              for(String splitString : splitArray){
                    char a = splitString.charAt(0);
                    sb += a;
              }
              

              System.out.println(sb.toUpperCase());
      }
}