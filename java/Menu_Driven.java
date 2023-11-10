import java.util.Scanner;
/* 
Write a program to find maximum no from given 3 no.
*/


class Menu_Driven {

    public static void main(String[] args) {
       int max_value = 0;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the numbers :");
       int value = sc.nextInt();


       int a[] = new int[value];
       for (int i = 0 ; i < value ; i++){
         System.out.print("Enter " + "Number: "+(i+1)+ ":" );
           a[i] = sc.nextInt();
       }

       for (int i = 0 ;i < 3 ; i++){
           if (a[i] > max_value){
                max_value = a[i];
           }
       }

       System.out.println(max_value);

    }
    
}
