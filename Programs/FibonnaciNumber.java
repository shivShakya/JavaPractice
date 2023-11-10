import java.util.Scanner;
public class FibonnaciNumber {

      public static boolean isPrefectSquare(int number){
             int sqrtNum = (int) Math.sqrt(number);
             return sqrtNum*sqrtNum == number;
      };

      public static boolean isFibonaci(int number){      
          return isPrefectSquare(5*number*number + 4) || isPrefectSquare(5*number*number -4) ;
      }
    

      public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

           System.out.println("Enter the number of Integers :");
           int num = sc.nextInt();

           int [] numInputs = new int[num];

           for(int i = 0 ; i < numInputs.length ; i++){
                 System.out.println("Enter the number : ");
                 numInputs[i] = sc.nextInt();
           }

           System.out.println("Fibbonacci Numbers : ");
           for(int nums : numInputs){
                 if(isFibonaci(nums)){
                        System.out.println(num);
                 }
           }

         sc.close();
            
            
      }
}
