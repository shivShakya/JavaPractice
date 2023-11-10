// prime no.
import java.util.Scanner;

class print_odd {
    static int n,i;
    static Boolean t = true;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("choose a number: ");
        n = sc.nextInt();
        for (int i = 2 ; i < n ; i++){
            if(n%i == 0){
                 System.out.println("not a prime");
                 t = false;
                 break;
            }
        }
        if(t){
        System.out.println("prime");
        }
    }
}
