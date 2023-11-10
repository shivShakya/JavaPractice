import java.util.Arrays;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        /* 
        int [] marks = new int[3];
        marks[0] = 67;
        marks[1] = 45;
        marks[2] = 23;
        System.out.println(marks.length);

        Arrays.sort(marks);
        System.out.println(marks[2]);
        */

       // int[][] finalMarks =  {{97,96,98},{92,94,78}};
       //System.out.println(finalMarks[1][1]);

       //System.out.println((int)(Math.random()*100));

       Scanner sc = new Scanner(System.in);
      
     //  System.out.println("Enter the age: " );
     //  int age  = sc.nextInt();
     //  System.out.println("Your age is " + age);

     //   String name = sc.nextLine();
      //  System.out.println(name);


      // program for printing odd numbers
      System.out.println("Print the number: ");
      int n = sc.nextInt();

      for(int i=1 ; i< n*2; i=i+2){
           System.out.println(i);
      }
       
      
      // to find the su of digits of a number
      
      System.out.println("Choose the number: ");
      int k = sc.nextInt();

      while(k != 0){
         
      }
    }
}