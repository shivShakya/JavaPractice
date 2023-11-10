import java.util.Scanner;
class Student{
    private int rollNo;
    private String name;
    private float percentage;
    public static int numberOfObjects = 0;

    public Student(){
        this.rollNo = 0001;
        this.name = "null";
        this.percentage = 0;

    }

    public Student(int rollNo , String name , float percentage){
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage;
        numberOfObjects++;
    }


    public int getRollNo()
	{
		return this.rollNo;
	}
        public String getName()
	{
		return this.name;
	}
        public double getPercentage()
	{
		return this.percentage;
	}



    public void displayCount(){
        System.out.println("Student Number "+numberOfObjects + " is successfully submitted."+"\n\n");
    }
    public void displayContent(){
        System.out.println("Roll No. ->  "+ rollNo + "\n" + "Name -> " + name +"\n"+  "Percentage -> " + percentage );
    }


    public static void sortStudent(Student s[],int n)
                {
                                for(int i=n-1;i>=0;i--)
                                {
                                                for(int j=0;j<i;j++)
                                                {
                                                                if(s[j].getPercentage()>s[j+1].getPercentage())
                                                                {
                                                                                Student t=s[j];
                                                                                s[j]=s[j+1];
                                                                                s[j+1]=t;
                                                                }
                                                }
                                }
                                for(int i=0;i<n;i++)
                                                s[i].displayContent();
 
                }

}

class Prog{
  
    public static void main(String[] args) {
        System.out.println("Number of students?: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student std[] = new Student[n];
        for (int i = 0 ; i < n; i++){
            
              System.out.println("Roll No: ");
              int r = sc.nextInt();
              
              System.out.println("Percentage : ");
              double p = sc.nextDouble();

              System.out.println("Name : ");
              String na = sc.next();

              std[i] = new Student(r,na,(float) p);

              std[i].displayCount();
              
              
        }

        for (int i =0 ; i < n; i++){
             std[i].displayContent();
        }


        System.out.println("Do you want to sort the students based on their percentage?(Yes/No)");
        String ans = sc.next();
        if(ans == "Yes"){
            Student.sortStudent(std,Student.numberOfObjects);
        }
    }
    

    
  
  
}
