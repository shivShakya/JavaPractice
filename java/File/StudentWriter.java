import java.io.*;

class Student implements Serializable {
    private String name;
    private int age;
    private String rollNumber;
   
    public Student(String name, int age, String rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }
   
    public String getName() {
        return name;
    }
   
    public int getAge() {
        return age;
    }
   
    public String getRollNumber() {
        return rollNumber;
    }
}

public class StudentWriter {
    public static void main(String[] args) {
        int n = 3; // number of students to copy
       
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("student.txt"));
           
            // write student objects to file
            for (int i = 1; i <= n; i++) {
                Student student = new Student("Student " + i, 20+i, "Roll-" + i);
                outputStream.writeObject(student);
            }
           
            outputStream.close();
           
            System.out.println("Student data written to file.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
            e.printStackTrace();
        }
    }
}