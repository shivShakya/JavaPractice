import java.util.Scanner;

class Arr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Length");
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for (int i =0 ; i < n ;i++){
            System.out.println("enter a["+i+"]:");
            a[i] = sc.nextInt();
        }
        System.out.println("Array Elements: \n");

        /* 
        for(int i =0 ; i < n ; i++){
          
            System.out.println(a[i]);
        }
        */
        for(int i =n-1 ; i >-1 ; i--){
          
            System.out.println(a[i]);
        }


    }
}