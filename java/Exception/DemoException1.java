import java.util.Scanner;
public class DemoException1{

     public static void main(String[] args){
        int i , j ,k = 0;
          try{
                Scanner sc = new Scanner(System.in);
                System.out.print("print number 1: ");
                i = sc.nextInt();
                System.out.print("print number 1: ");
                j = sc.nextInt();
                k = i/j;

                if (j == 1){
                    throw new ArithmeticException(" it will be in integer only");
                }
         } 
        catch(ArithmeticException e){
               System.out.println("the exception is" + e);
         }

          System.out.println("the division is: "+ k);
     }
}