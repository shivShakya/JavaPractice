class Student{
    private int rollNo;
    private String name;
    private double percentage;
    public static int numberOfObjects = 0;

    public Student(){
        
    }

    public Student(int rollNo , String name , double percentage){
        this.rollNo = rollNo;
        this.name = name;
        this.percentage = percentage;
        numberOfObjects++;
    }

    public void displayCount(){
        System.out.println("\n\n"+"Student Number : "+numberOfObjects);
    }
    public void displayContent(){
        System.out.println("Roll No. ->  "+ rollNo + "\n" + "Name -> " + name +"\n"+  "Percentage -> " + percentage );
    }
}


class Display{
    public static void main(String[] args) {
        // first object
        Student s1 = new Student(124550,"Shivam Shakya",82.2);
        s1.displayCount();
        s1.displayContent();
        //second object
        Student s2 = new Student(124551,"Anubhav Jain",78.6);
        s2.displayCount();
        s2.displayContent();
        //third object
        Student s3 = new Student(124552,"Rohit Dongre",86.2);
        s3.displayCount();
        s3.displayContent();



    }
}

/*
class MyProgram{
     public static void main(String[] args) {
        System.out.println("Number of objects: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student std[] = new Student[n];

        for (int i = 0 ; i < n ; i++){
            
        }
     }
}
*/