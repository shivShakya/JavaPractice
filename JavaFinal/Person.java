import java.util.Scanner;

public class Person{
        
       private String fname ; 
       private  String lname ;
       private int AADHARNo;

       public Person(){
            this.fname = "";
            this.lname = "";
            this.AADHARNo = 0;
       }

       public Person(String fname , String lname ,int AADHARNo){
             this.fname = fname;
             this.lname = lname;
             this.AADHARNo = AADHARNo;
       }

       public void setFname(String fname){
                this.fname = fname;
       }
       public String  getFname(){
            return this.fname;
       }



       public void setLname(String  lname){
            this.lname = lname;
       }
       public String getLname(){
            return this.lname;
       }

       public void setAADHARNo(int AADHARNo){
             this.AADHARNo = AADHARNo;
       }
       public int getAADHARNo(){
            return this.AADHARNo;
       }


       public static void main(String[] args){  
                  Scanner sc = new Scanner(System.in);

                  System.out.print("Number of Persons ? : ");
                  int n = sc.nextInt();

                  Person [] personArray = new Person[n] ;

                  for( int i = 0 ; i < n ; i++){
                           
                        System.out.print("Enter the First Name : ");
                        String Fname = sc.next();
                        
                        
                        System.out.print("Enter the Second Name : ");
                        String Lname = sc.next();
                        System.out.print("Enter the Aadhar number :");
                        int AADHARNo = sc.nextInt();


                        Person p = new Person(Fname ,Lname, AADHARNo);
                        personArray[i] = p;
                  }

                  System.out.println("Search Your Aadhar Number : ");
                  int aadhar = sc.nextInt();


                 for (int i =0 ; i < n ; i++){

                      Person  p = personArray[i];
                      int serAadhar = p.getAADHARNo();

                      if (serAadhar == aadhar){
                             String FirstName = p.getFname();
                             String LastName = p.getLname();
                             int AadharNumber = p.getAADHARNo();
                             System.out.println( " Name : " + FirstName + " " + LastName + "\n" + "Aadhar Number :" + AadharNumber);
                      } 
                 }
       }
}