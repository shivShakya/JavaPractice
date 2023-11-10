import java.util.Scanner;
// WAP to print if a number is odd or even
class Odd_even {
   
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number: ");
         int a =  sc.nextInt();
         if (a%2 == 1){
            System.out.println("The number is odd");
         }else{
            System.out.println("The number is even");
         }
    }

}
