import java.util.Scanner;


class ShivException extends Exception{
       
       public ShivException(String s){
              super(s);
       }
}

public class Demo {
public static void main(String args[]) {
int balance = 5000;
Scanner sc = new Scanner(System.in);
System.out.println("Enter Amount to withdraw");
int withdraw = sc.nextInt();
try {
if(balance - withdraw < 1000) {
   throw new ShivException("Balance < 1000 error");
}
else {
   balance = balance - withdraw;
   System.out.println(balance);
}
}catch(Exception e) {
    e.printStackTrace();
}
finally{
    sc.close();
}
}
}