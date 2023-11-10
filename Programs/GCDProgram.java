import java.util.Scanner;


public class GCDProgram{

    public static int gcdProgram( int a  , int b ){
        
          if ( b == 0){
               return a ;
          }
          return gcdProgram(b, a % b);
                    
    }

    public static void main(String [] args){
          
           
        Scanner sc = new Scanner (System.in);
      

        System.out.println("Enter the first number :");
       int a = sc.nextInt();

       System.out.println("Enter the second number :");
       int b = sc.nextInt();

       int gcd = gcdProgram(a, b);

     //  int hcf = (a * b)/gcd;

       System.out.println( " GCD  : " + gcd );
    //   System.out.println(" HCF :" + hcf );

        
    }
      
}