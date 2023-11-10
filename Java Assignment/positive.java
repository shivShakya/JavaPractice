import java.util.Scanner;

/* 


public class positive {
    public static void main(String[] args){
      
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       if(x > 0){
           System.out.println("Positve");
       }
    }
}
*/
/* 
class difference{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Number 1 :");
         int x = sc.nextInt();
         System.out.println("Number 2 :");
         int y = sc.nextInt();

         int res = x - y;

         if (res < 0 ){
            System.out.println("DIFFERENCE IS NAGATIVE");
         }else if (res > 0){
            System.out.println("DIFFERENCE IS POSITIVE ");
         }
         

    }
}
*/
/* 
class OddEven {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int x = sc .nextInt();
        if ( x%2 == 1 ){
           System.out.println("Odd");

        }else{
            System.out.println("Even");
        }
    }
}
*/

class traingle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1st Angle: ");
        int x = sc.nextInt();
        System.out.println("2nd Angle: ");
        int y = sc.nextInt();
        System.out.println("3rd Angle: ");
        int z = sc.nextInt();

        if ((x + y + z ) == 180){
            System.out.println("Yes it is a traingle");
        }else{
            System.out.println("Nope it is not a traingle ");
        }
    }
}