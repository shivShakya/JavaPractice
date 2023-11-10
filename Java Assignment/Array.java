import java.util.Scanner;

public class Array{

    public static void main(String[] args) {
        int a[];

        a = new int[5];

        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < a.length ; i++){
                int input = sc.nextInt();
                a[i] = input;
                System.out.println("successfully inserted "+input+ " value");    
            }
        }

        for (int i =0 ; i < a.length ; i++){
            System.out.println(a[i]);
        }

    }
}