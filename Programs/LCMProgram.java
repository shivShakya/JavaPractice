import java.util.Scanner;

public class LCMProgram{
      
     
     public static int lcmProgram(int [] arr){
            int lcm = arr[0];
            for(int i = 1 ; i < arr.length ; i++){
                  
                  lcm = (lcm * arr[i])/gcdProgram(lcm , arr[i]);
            }

            return lcm;
     }

     public static int gcdProgram( int a  , int b ){
        
        if ( b == 0){
             return a ;
        }
        return gcdProgram(b, a % b);
                  
  }

      
     public static void main(String [] args ){

          Scanner sc = new Scanner(System.in);

          System.out.println("Enter the length of array ");
          int n = sc.nextInt();

          int [] arr = new int[n];

          System.out.println("Enter the element");
          for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
          }



          int lcm = lcmProgram(arr);
          System.out.println("LCM : "+ lcm);     
         
          sc.close();
             
     }
}