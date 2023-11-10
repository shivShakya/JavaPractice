import java.util.Scanner;

/* 
In a company an employee is paid as under:
• If his basic salary is less than Rs. 1500, then HRA = 10% of basic salary and DA = 90% of basic salary.
• If his salary is either equal to or above Rs. 1500, then HRA = Rs. 500 and DA = 98% of basic salary.
• Employee's salary is input through the keyboard, write a program to find his gross salary.
*/

class Gr_Salary{
    static int salery,HRA,DA,gross_sal;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salery: ");
        salery = sc.nextInt();

        if (salery < 1500 ){
             HRA = salery - (salery* (10/100));
             DA = salery - (salery* (90/100));

        }else if (salery >=1500){
             HRA = 500;
             DA = salery - (salery* (98/100));
        }  
        
       gross_sal = salery + HRA + DA;
       System.out.println("Gross salery is "+ gross_sal);
    }


}

